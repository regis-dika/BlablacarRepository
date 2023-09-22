package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class MultimodalId(
    @Json(name = "id")
    val id: String,
    @Json(name = "source")
    val source: String
)