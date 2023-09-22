package com.example.newblablacar.tripseach.domain.usecases

import com.example.newblablacar.core.tripsearch.usescase.GetTripsSearchUseCase
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import javax.inject.Inject

class GetTripsSearchUseCaseImpl@Inject constructor(
    private val tripSearchRepository: TripSearchRepository
) : GetTripsSearchUseCase{
    override suspend fun invoke(from: String, to: String, searchId: String, cursor: String?): Result<List<BlablaTrip>> {
        return tripSearchRepository.getTrips(from, to, searchId, cursor)
    }
}