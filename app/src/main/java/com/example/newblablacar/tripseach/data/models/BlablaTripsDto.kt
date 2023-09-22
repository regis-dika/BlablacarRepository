package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class BlablaTripsDto(
    @Json(name = "facets_details")
    val facetsDetails: FacetsDetails,
    @Json(name = "tabs")
    val tabs: List<String>
)