package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class TokenizedPriceDetails(
    @Json(name = "tokenized_price")
    val tokenizedPrice: List<TokenizedPrice>
)