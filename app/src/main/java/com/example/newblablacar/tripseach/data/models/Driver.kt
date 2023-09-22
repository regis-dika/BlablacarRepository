package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Driver(
    @Json(name = "display_name")
    val displayName: String,
    @Json(name = "rating")
    val rating: Rating,
    @Json(name = "thumbnail")
    val thumbnail: String,
    @Json(name = "verification_status")
    val verificationStatus: VerificationStatus
)