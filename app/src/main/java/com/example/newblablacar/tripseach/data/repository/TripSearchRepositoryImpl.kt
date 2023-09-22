package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import okhttp3.MediaType
import okhttp3.ResponseBody
import javax.inject.Inject

class TripSearchRepositoryImpl @Inject constructor(
    private val tripSearchApi: TripSearchApi
) : TripSearchRepository {
    override suspend fun getTrips(from: String, to: String, searchId: String, cursor: String?): ResponseBody {
        return try {
            val result = tripSearchApi.tripSearch(from, to, searchId, cursor)
            result
        } catch (e: Exception) {
            ResponseBody.create(MediaType.get("application/json"), e.message.toString())
        }
    }
}