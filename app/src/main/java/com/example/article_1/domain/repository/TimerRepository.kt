package com.example.article_1.domain.repository

import androidx.lifecycle.LiveData
import com.example.article_1.data.model.Timer
import com.example.article_1.data.model.TimerDAO

interface TimerRepository{

//    val timers = dao.getAllTimers()
//
//    suspend fun insert(timer: Timer){
//        dao.insertTimer(timer)
//    }
//    suspend fun update(timer: Timer){
//        dao.updateTimer(timer)
//    }
//    suspend fun delete(timer: Timer){
//        dao.deleteTimer(timer)
//    }

    suspend fun deleteTimer(timer: Timer)
    suspend fun updateTimer(timer: Timer)
    suspend fun insertTimer(timer: Timer)
    suspend fun getAllTimers():LiveData<List<Timer>>

}