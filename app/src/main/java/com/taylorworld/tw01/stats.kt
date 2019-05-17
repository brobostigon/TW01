package com.taylorworld.tw01

import androidx.lifecycle.LiveData
import androidx.room.*
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "stat_table")
data class Stats (
    @PrimaryKey @ColumnInfo(name = "charecter") var charecter: String,
    @ColumnInfo(name = "str") var str: Int,
    @ColumnInfo(name = "dex") var dex: Int,
    @ColumnInfo(name = "int") var int: Int,
    @ColumnInfo(name = "wis") var wis: Int,
    @ColumnInfo(name = "con") var con: Int,
    @ColumnInfo(name = "cha") var cha: Int
)
{
    constructor() : this("", 0, 0, 0, 0, 0, 0)
}

@Dao
interface StatDao {
    @Query("SELECT * from stat_table")
    fun getStats(): LiveData<List<Stats>>

    @Insert
    suspend fun insert(stat: Stats)

    //@Abstract val statDao: StatDao{}
}