package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Amenity(
    @Json(name = "icon_path")
    val iconPath: String,
    @Json(name = "label")
    val label: String
)