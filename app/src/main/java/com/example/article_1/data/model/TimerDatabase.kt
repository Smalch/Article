package com.example.article_1.data.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Timer::class], version = 1)
abstract class TimerDatabase : RoomDatabase(){
    abstract val timerDAO: TimerDAO


    companion object{
        @Volatile
        private var INSTANCE : TimerDatabase? = null

        fun getInstance(context: Context): TimerDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance==null){
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        TimerDatabase::class.java,
                        "timer_data_database"
                    ).build()
                }
                return instance
            }
        }
    }
}