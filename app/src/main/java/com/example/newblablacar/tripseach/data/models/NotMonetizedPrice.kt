package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class NotMonetizedPrice(
    @Json(name = "amount")
    val amount: String,
    @Json(name = "currency")
    val currency: String
)