package com.example.article_1.data.repository

import androidx.lifecycle.LiveData
import com.example.article_1.data.model.Timer
import com.example.article_1.data.model.TimerDAO
import com.example.article_1.domain.repository.TimerRepository

class TimerRepositoryImpl(
    private val dao: TimerDAO
): TimerRepository {
    override suspend fun deleteTimer(timer: Timer) = dao.deleteTimer(timer)


    override suspend fun updateTimer(timer: Timer) = dao.updateTimer(timer)


    override suspend fun insertTimer(timer: Timer) = dao.insertTimer(timer)

    override suspend fun getAllTimers(): LiveData<List<Timer>> {
        return dao.getAllTimers()
    }


}