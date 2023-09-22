package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Facet(
    @Json(name = "items")
    val items: List<Item>,
    @Json(name = "max_visible_filter_items")
    val maxVisibleFilterItems: Int,
    @Json(name = "title")
    val title: String,
    @Json(name = "type")
    val type: String
)