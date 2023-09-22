package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class MonetizedPrice(
    @Json(name = "amount")
    val amount: String,
    @Json(name = "currency")
    val currency: String
)