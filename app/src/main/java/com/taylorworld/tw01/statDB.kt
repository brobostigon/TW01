//package com.taylorworld.tw01

//@Database(
//    entities = [(Stats::class)],
//    version = 1,
//    exportSchema = false
//)
//abstract class DDDatabase : RoomDatabase() {
//    abstract fun statDao(): StatDao

//    private var inst: DDDatabase? = null
//    private val instLock = Object()

//    fun getInstance(context: Context): DDDatabase = inst ?: synchronized(instLock) {
//        return inst ?: run {
//            inst = Room.databaseBuilder(
//                context,
//                DDDatabase::class.java, "CharecterStats"
//            ).build()
//            inst!!
//        }
//    }
//}