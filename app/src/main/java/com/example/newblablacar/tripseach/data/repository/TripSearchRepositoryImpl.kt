package com.example.newblablacar.tripseach.data.repository

import com.example.newblablacar.BuildConfig
import com.example.newblablacar.core.utils.resource.Error
import com.example.newblablacar.core.utils.resource.Loading
import com.example.newblablacar.core.utils.resource.Resource
import com.example.newblablacar.core.utils.resource.Success
import com.example.newblablacar.tripseach.data.helpers.toBlalaTripDomain
import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
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
            val result = tripSearchApi.tripSearch(from, to, BuildConfig.SEARCH_UUID, cursor)
            emit(Success(result.toBlalaTripDomain()))
        } catch (e: Exception) {
            emit(Error<List<BlablaTrip>>(e.toString()))
        }
    }
}