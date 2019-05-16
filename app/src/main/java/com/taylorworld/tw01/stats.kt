package com.taylorworld.tw01

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "stat_table")
data class Stats (
    @PrimaryKey @ColumnInfo(name = "charecter") val charecter: String,
    @ColumnInfo(name = "str") val str: String,
    @ColumnInfo(name = "dex") val dex: String,
    @ColumnInfo(name = "int") val int: String,
    @ColumnInfo(name = "wis") val wis: String,
    @ColumnInfo(name = "con") val con: String,
    @ColumnInfo(name = "cha") val cha: String
)

@Dao
interface StatDao {
    @Query("SELECT charecter, str, dex, int, wis, con, cha from stat_table")
    fun getStats(): LiveData<List<Stats>>

    @Insert
    suspend fun insert(stat: Stats)

    //@Abstract val statDao: StatDao{}
}

@Database(
    entities = [(Stats::class)],
    version = 1,
    exportSchema = false
)
abstract class DDDatabase : RoomDatabase() {

    abstract fun statDao(): StatDao

    private var inst: DDDatabase? = null
    private val instLock = Object()

    fun getInstance(context: Context): DDDatabase = inst ?: synchronized(instLock) {
        return inst ?: run {
            inst = Room.databaseBuilder(
                context,
                DDDatabase::class.java, "CharecterStats"
            ).build()
            inst!!
        }
    }
}