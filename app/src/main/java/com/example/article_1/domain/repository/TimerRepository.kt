package com.example.article_1.domain.repository

import com.example.article_1.data.model.Timer
import com.example.article_1.data.model.TimerDAO

class TimerRepository(private val dao:TimerDAO) {

    val timers = dao.getAllTimers()

    suspend fun insert(timer: Timer){
        dao.insertTimer(timer)
    }
    suspend fun update(timer: Timer){
        dao.updateTimer(timer)
    }
    suspend fun delete(timer: Timer){
        dao.deleteTimer(timer)
    }



}