package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Item(
    @Json(name = "enabled")
    val enabled: Boolean,
    @Json(name = "icon_path")
    val iconPath: String,
    @Json(name = "name")
    val name: String,
    @Json(name = "query_param_field")
    val queryParamField: String,
    @Json(name = "query_param_value")
    val queryParamValue: String,
    @Json(name = "selected")
    val selected: Boolean,
    @Json(name = "trips_count")
    val tripsCount: Int
)