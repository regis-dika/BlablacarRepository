package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Waypoint(
    @Json(name = "departure_datetime")
    val departureDatetime: String,
    @Json(name = "extra_distance")
    val extraDistance: ExtraDistance,
    @Json(name = "main_text")
    val mainText: String,
    @Json(name = "place")
    val place: Place,
    @Json(name = "type")
    val type: List<String>
)