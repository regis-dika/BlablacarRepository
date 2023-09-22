package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Place(
    @Json(name = "address")
    val address: String,
    @Json(name = "city")
    val city: String,
    @Json(name = "country_code")
    val countryCode: String,
    @Json(name = "latitude")
    val latitude: Double,
    @Json(name = "longitude")
    val longitude: Double
)