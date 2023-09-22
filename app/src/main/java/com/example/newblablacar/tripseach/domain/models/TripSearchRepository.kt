package com.example.newblablacar.tripseach.domain.models

import okhttp3.ResponseBody

interface TripSearchRepository {
    suspend fun getTrips(from: String, to: String, cursor: String? = null): Result<List<BlablaTrip>>
}