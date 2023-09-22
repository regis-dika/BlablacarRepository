package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.core.utils.resource.Error
import com.example.newblablacar.core.utils.resource.Loading
import com.example.newblablacar.core.utils.resource.Resource
import com.example.newblablacar.core.utils.resource.Success
import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import com.example.newblablacar.tripseach.utils.SEARCH_UUID
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class TripSearchRepositoryImpl @Inject constructor(
    private val tripSearchApi: TripSearchApi
) : TripSearchRepository {
    override suspend fun getTrips(
        from: String,
        to: String,
        cursor: String?
    ): Flow<Resource<List<BlablaTrip>>> = flow {
        emit(Loading())
        try {
            val result = tripSearchApi.tripSearch(from, to, SEARCH_UUID, cursor)
            //TODO mapper
            emit(Success(result.trips.map {
                BlablaTrip(
                    it.waypoints.get(0).mainText,
                    it.waypoints.get(1).mainText,
                    it.driver.displayName,
                    it.priceDetails.price
                )
            }))
        } catch (e: Exception) {
            emit(Error<List<BlablaTrip>>(e.toString()))
        }
    }
}