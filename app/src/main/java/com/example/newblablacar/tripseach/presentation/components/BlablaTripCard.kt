package com.example.newblablacar.tripseach.presentation.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.newblablacar.tripseach.domain.models.BlablaTrip

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlablaTripCard(
    blablaTrip: BlablaTrip,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier
        .fillMaxWidth()
        .padding(16.dp), onClick = { /*TODO*/ }) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
            Column(verticalArrangement = Arrangement.SpaceAround) {
                Text(text = "Départ : ${blablaTrip.from}")
                Text(text = "Arrivée : ${blablaTrip.to}")
                Row {
                    Text(text = "Prénom : ${blablaTrip.driverName}")
                }
            }
            Text(text = blablaTrip.price, modifier = Modifier.weight(1f))
        }
    }
}

@Preview
@Composable
fun BlablaTripCardpreview() {
    BlablaTripCard(blablaTrip = BlablaTrip())
}