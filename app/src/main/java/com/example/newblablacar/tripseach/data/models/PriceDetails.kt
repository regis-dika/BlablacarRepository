package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class PriceDetails(
    @Json(name = "price")
    val price: String
)