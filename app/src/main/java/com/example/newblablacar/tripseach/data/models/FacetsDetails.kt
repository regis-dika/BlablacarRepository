package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class FacetsDetails(
    @Json(name = "active_filters_count")
    val activeFiltersCount: Int,
    @Json(name = "facets")
    val facets: List<Facet>
)