package com.example.newblablacar.tripseach.presentation.screens.trips

import com.example.newblablacar.tripseach.domain.models.BlablaTrip

data class BlablaTripListState(
    val trips: List<BlablaTrip> = listOf()
)
