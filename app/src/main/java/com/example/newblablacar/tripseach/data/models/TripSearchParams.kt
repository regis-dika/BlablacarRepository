package com.example.newblablacar.tripseach.data.models

import com.squareup.moshi.Json

data class TripSearchParams(
    @Json(name = "from_address")
    val fromAddress : String,
    @Json(name = "to_address")
    val toAddress : String,
    @Json(name = "search_uuid")
    val searchUuid : String,
    @Json(name = "from_cursor")
    val fromCursor : String? = null,
)
