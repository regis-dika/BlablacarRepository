package com.example.newblablacar.tripseach.presentation.screens.trips

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.presentation.components.BlablaTripCard

@Composable
fun BlablaTripListScreen(
    blablaTripList: List<BlablaTrip>
) {
    Column(modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(blablaTripList) { trip ->
                BlablaTripCard(blablaTrip = trip)
            }
        }
    }
}