package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class MonetizationPrice(
    @Json(name = "monetized_price")
    val monetizedPrice: MonetizedPrice,
    @Json(name = "not_monetized_price")
    val notMonetizedPrice: NotMonetizedPrice
)