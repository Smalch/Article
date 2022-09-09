package com.example.article_1.domain.usecase

import com.example.article_1.data.model.Timer
import com.example.article_1.domain.repository.TimerRepository

class AddTimerUseCase(private val timerRepository : TimerRepository) {

    suspend fun addTimer(timer: Timer){
        timerRepository.insertTimer(timer)
    }


}