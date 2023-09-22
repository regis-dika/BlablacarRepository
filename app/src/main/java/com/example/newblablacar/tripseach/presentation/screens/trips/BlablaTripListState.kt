package com.example.newblablacar.tripseach.presentation.screens.trips

import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.core.utils.resource.Loading
import com.example.newblablacar.core.utils.resource.Resource

data class BlablaTripListState(
    val fromAddress :String = "",
    val toAddress :String = "",
    val trips: Resource<List<BlablaTrip>> = Loading()
)
