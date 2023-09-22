package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json
data class Trip(
    @Json(name = "amenities")
    val amenities: List<Amenity>,
    @Json(name = "disabled_selection")
    val disabledSelection: DisabledSelection?,
    @Json(name = "driver")
    val driver: Driver,
    @Json(name = "highlights")
    val highlights: List<Any>,
    @Json(name = "monetization_price")
    val monetizationPrice: MonetizationPrice,
    @Json(name = "multimodal_id")
    val multimodalId: MultimodalId,
    @Json(name = "price_details")
    val priceDetails: PriceDetails,
    @Json(name = "tags")
    val tags: List<Any>,
    @Json(name = "tokenized_price_details")
    val tokenizedPriceDetails: TokenizedPriceDetails,
    @Json(name = "total_duration")
    val totalDuration: String,
    @Json(name = "waypoints")
    val waypoints: List<Waypoint>
)