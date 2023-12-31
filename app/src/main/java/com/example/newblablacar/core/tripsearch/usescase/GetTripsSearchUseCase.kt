package com.example.newblablacar.core.tripsearch.usescase

import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.core.utils.resource.Resource
import kotlinx.coroutines.flow.Flow
/**
 * Abstraction for use this usecase in other modules
 */
interface GetTripsSearchUseCase {
    suspend fun invoke(from: String, to: String, cursor: String?): Flow<Resource<List<BlablaTrip>>>
}