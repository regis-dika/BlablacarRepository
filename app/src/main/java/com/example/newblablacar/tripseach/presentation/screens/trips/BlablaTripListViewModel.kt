package com.example.newblablacar.tripseach.presentation.screens.trips

import androidx.lifecycle.ViewModel
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class BlablaTripListViewModel @Inject constructor() : ViewModel() {
    val state: MutableStateFlow<BlablaTripListState> = MutableStateFlow(
        BlablaTripListState(
            listOf(
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
                BlablaTrip(),
            )
        )
    )
}