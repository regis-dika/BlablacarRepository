package com.example.newblablacar.tripseach.domain.usecases

import com.example.newblablacar.core.tripsearch.usescase.GetTripsSearchUseCase
import com.example.newblablacar.core.utils.resource.Resource
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetTripsSearchUseCaseImpl@Inject constructor(
    private val tripSearchRepository: TripSearchRepository
) : GetTripsSearchUseCase{
    override suspend fun invoke(from: String, to: String, cursor: String?): Flow<Resource<List<BlablaTrip>>> {
        return tripSearchRepository.getTrips(from, to, cursor)
    }
}