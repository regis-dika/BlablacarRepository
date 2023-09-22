package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class TokenizedPrice(
    @Json(name = "token")
    val token: String,
    @Json(name = "token_type")
    val tokenType: String
)