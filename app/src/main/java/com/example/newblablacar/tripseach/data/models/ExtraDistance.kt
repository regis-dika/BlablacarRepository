package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class ExtraDistance(
    @Json(name = "distance_unit")
    val distanceUnit: String,
    @Json(name = "distance_value")
    val distanceValue: Int,
    @Json(name = "proximity")
    val proximity: String
)