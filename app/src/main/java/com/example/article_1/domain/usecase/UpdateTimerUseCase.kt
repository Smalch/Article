package com.example.article_1.domain.usecase

import com.example.article_1.data.model.Timer
import com.example.article_1.domain.repository.TimerRepository

class UpdateTimerUseCase(private val timerRepository: TimerRepository) {

    suspend fun updateTimer(timer : Timer){
        timerRepository.updateTimer(timer)
    }


}