package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import com.example.newblablacar.tripseach.utils.SEARCH_UUID
import javax.inject.Inject

class TripSearchRepositoryImpl @Inject constructor(
    private val tripSearchApi: TripSearchApi
) : TripSearchRepository {
    override suspend fun getTrips(
        from: String,
        to: String,
        cursor: String?
    ): Result<List<BlablaTrip>> {
        return try {
            val result = tripSearchApi.tripSearch(from, to, SEARCH_UUID, cursor)
            Result.success(result.trips.map {
                BlablaTrip(
                    it.waypoints.get(0).mainText,
                    it.waypoints.get(1).mainText,
                    it.driver.displayName,
                    it.priceDetails.price
                )
            })
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}