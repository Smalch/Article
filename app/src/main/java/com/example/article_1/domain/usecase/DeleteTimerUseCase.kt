package com.example.article_1.domain.usecase

import com.example.article_1.data.model.Timer
import com.example.article_1.domain.repository.TimerRepository

class DeleteTimerUseCase(private val timerRepository : TimerRepository) {


    suspend fun deleteTimer(timer: Timer){
        timerRepository.deleteTimer(timer)
    }
}