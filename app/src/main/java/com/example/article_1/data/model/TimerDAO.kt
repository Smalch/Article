package com.example.article_1.data.model

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface TimerDAO {


    @Insert
    suspend fun insertTimer(timer: Timer)

    @Update
    suspend fun updateTimer(timer: Timer)


    @Delete
    suspend fun deleteTimer(timer: Timer)

    @Query("select * from timer")
    fun getAllTimers():LiveData<List<Timer>>

}