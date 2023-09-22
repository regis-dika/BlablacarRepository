package com.example.newblablacar.tripseach.presentation.screens.trips

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newblablacar.core.tripsearch.usescase.GetTripsSearchUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlablaTripListViewModel @Inject constructor(
    private val getTripsSearchUseCase: GetTripsSearchUseCase
) : ViewModel() {
    val state: MutableStateFlow<Result<BlablaTripListState>> = MutableStateFlow(
        Result.success(
            BlablaTripListState(
                listOf()
            )
        )
    )

    fun fetchTrip(searchUuid: String) {
        viewModelScope.launch {
            val result = getTripsSearchUseCase.invoke("Paris", "Toulouse", "8401658C-E98D-457E-A087-34FA2D979D694R", null)
            if (result.isSuccess) {
                state.value = Result.success(BlablaTripListState(result.getOrDefault(listOf())))
            } else {
                state.value = Result.failure(result.exceptionOrNull() ?: Throwable("error"))
            }
        }
    }
}