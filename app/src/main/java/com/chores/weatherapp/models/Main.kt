package com.chores.weatherapp.models

import com.google.gson.annotations.SerializedName

data class Main (
    @field:SerializedName("temp")
    val temp: Int,

    @field:SerializedName("feels_like")
    val feels_like: Double,

    @field:SerializedName("temp_min")
    val temp_min: Double,

    @field:SerializedName("temp_max")
    val temp_max: Double,

    @field:SerializedName("pressure")
    val pressure: Int,

    @field:SerializedName("humidity")
    val humidity: Int,

    @field:SerializedName("sea_level")
    val sea_level: Int,

    @field:SerializedName("grnd_level")
    val grnd_level: Int
        )
