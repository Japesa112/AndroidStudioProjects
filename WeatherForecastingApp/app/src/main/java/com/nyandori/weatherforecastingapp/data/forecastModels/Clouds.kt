package com.nyandori.weatherforecastingapp.data.forecastModels


import com.google.gson.annotations.SerializedName

data class Clouds(
    @SerializedName("all")
    val all: Int
)