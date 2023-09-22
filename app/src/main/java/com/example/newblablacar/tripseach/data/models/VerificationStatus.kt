package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class VerificationStatus(
    @Json(name = "code")
    val code: String
)