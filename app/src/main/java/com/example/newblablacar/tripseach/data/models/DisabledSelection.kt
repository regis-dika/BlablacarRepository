package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class DisabledSelection(
    @Json(name = "message")
    val message: String
)