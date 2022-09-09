package com.example.article_1.domain.usecase

import androidx.lifecycle.LiveData
import com.example.article_1.data.model.Timer
import com.example.article_1.domain.repository.TimerRepository

class GetTimersUseCase(private val timerRepository: TimerRepository) {

    suspend fun getAllTimers() : LiveData<List<Timer>>{
        return timerRepository.getAllTimers()
    }

}