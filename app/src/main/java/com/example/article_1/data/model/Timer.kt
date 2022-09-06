package com.example.article_1.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName


@Entity(
    tableName = "timer"
)

data class Timer (

    @PrimaryKey(autoGenerate = true)
    val id: Int? =null,

    @SerializedName("time")
    val time: Int


    )

