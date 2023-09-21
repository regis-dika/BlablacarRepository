package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.tripseach.data.models.TripSearchParams
import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import okhttp3.ResponseBody
import javax.inject.Inject

class TripSearchRepositoryImpl @Inject constructor(
    private val tripSearchApi: TripSearchApi
) : TripSearchRepository {
    override suspend fun getTrips(from: String, to: String, searchId: String, cursor: String?): ResponseBody {
        val tripSearchParams = TripSearchParams(from, to, searchId, cursor)
        return tripSearchApi.tripSearch(tripSearchParams)
    }
}