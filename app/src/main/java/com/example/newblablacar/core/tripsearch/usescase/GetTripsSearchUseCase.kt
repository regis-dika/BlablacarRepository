package com.example.newblablacar.core.tripsearch.usescase

import com.example.newblablacar.tripseach.domain.models.BlablaTrip

interface GetTripsSearchUseCase {
    suspend fun invoke(from: String, to: String, cursor: String?): Result<List<BlablaTrip>>
}