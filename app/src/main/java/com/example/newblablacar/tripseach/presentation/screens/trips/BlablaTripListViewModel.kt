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

    init {
        fetchTrip()
    }

    private fun fetchTrip() {
        viewModelScope.launch {
            val result = getTripsSearchUseCase.invoke("Paris", "Lyon", null)
            if (result.isSuccess) {
                state.value = Result.success(BlablaTripListState(result.getOrDefault(listOf())))
            } else {
                state.value = Result.failure(result.exceptionOrNull() ?: Throwable("error"))
            }
        }
    }
}