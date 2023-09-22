package com.example.newblablacar.tripseach.domain.models

import okhttp3.ResponseBody

interface TripSearchRepository {
    suspend fun getTrips(from: String, to: String, searchId: String, cursor: String? = null): ResponseBody
}