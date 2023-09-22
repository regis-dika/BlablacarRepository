package com.example.newblablacar.tripseach.data.helpers

import com.example.newblablacar.tripseach.data.models.BlalaTripsDto
import com.example.newblablacar.tripseach.domain.models.BlablaTrip

fun BlalaTripsDto.toBlalaTripDomain(): List<BlablaTrip> {
    val trips = this.trips
    return trips.map {
        BlablaTrip(
            it.waypoints.get(0).mainText,
            it.waypoints.get(1).mainText,
            it.driver.displayName,
            it.priceDetails.price
        )
    }
}