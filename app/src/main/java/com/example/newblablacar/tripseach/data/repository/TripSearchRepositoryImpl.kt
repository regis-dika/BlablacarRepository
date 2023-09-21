package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import javax.inject.Inject

class TripSearchRepositoryImpl @Inject constructor(
    private val tripSearchApi: TripSearchApi
) : TripSearchRepository {
    override suspend fun getTrips(from: String, to: String, searchId: String, cursor: String?): String {
        return try {
            tripSearchApi.tripSearch(from, to, searchId, cursor).toString()
        } catch (e: Exception) {
             e.message.toString()
        }
    }
}