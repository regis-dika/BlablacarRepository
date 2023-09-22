package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class BlalaTripsDto(
    @Json(name = "trips")
    val trips: List<Trip>
)