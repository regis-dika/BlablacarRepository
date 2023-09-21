package com.example.newblablacar.tripseach.domain.models

interface TripSearchRepository {
    suspend fun getTrips(from: String, to: String, searchId: String, cursor: String? = null)
}