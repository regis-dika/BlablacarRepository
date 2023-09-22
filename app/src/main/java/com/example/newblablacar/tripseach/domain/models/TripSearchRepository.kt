package com.example.newblablacar.tripseach.domain.models

import com.example.newblablacar.core.utils.resource.Resource
import kotlinx.coroutines.flow.Flow
import okhttp3.ResponseBody

interface TripSearchRepository {
    suspend fun getTrips(from: String, to: String, cursor: String? = null): Flow<Resource<List<BlablaTrip>>>
}