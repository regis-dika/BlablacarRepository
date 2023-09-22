package com.example.newblablacar.tripseach.presentation.screens.trips

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newblablacar.core.tripsearch.usescase.GetTripsSearchUseCase
import com.example.newblablacar.core.utils.resource.Error
import com.example.newblablacar.core.utils.resource.Loading
import com.example.newblablacar.core.utils.resource.Success
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlablaTripListViewModel @Inject constructor(
    private val getTripsSearchUseCase: GetTripsSearchUseCase
) : ViewModel() {
    private val _state: MutableStateFlow<BlablaTripListState> = MutableStateFlow(
        BlablaTripListState()
    )
    val state get() = _state.asStateFlow()

    fun fetchTrip() {
        viewModelScope.launch {
            getTripsSearchUseCase.invoke(state.value.fromAddress, state.value.toAddress, null).collect { res ->
                _state.update {
                    it.copy(trips = res)
                }
            }
        }
    }
}