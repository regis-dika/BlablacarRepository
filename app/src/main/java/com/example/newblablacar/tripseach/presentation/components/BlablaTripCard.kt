package com.example.newblablacar.tripseach.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
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
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp), horizontalArrangement = Arrangement.SpaceAround
        ) {
            Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                Text(text = "Départ : ${blablaTrip.from}")
                Text(text = "Arrivée : ${blablaTrip.to}")
                Row(
                    horizontalArrangement = Arrangement.spacedBy(4.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    AsyncImage(
                        model = blablaTrip.driverPictureUrl,
                        modifier = Modifier
                            .clip(shape = CircleShape),
                        contentDescription = null
                    )
                    Text(text = blablaTrip.driverName, fontWeight = FontWeight.SemiBold)
                }
            }
            Box(modifier = Modifier.weight(1f), contentAlignment = Alignment.CenterEnd) {
                Text(text = blablaTrip.price, fontFamily = FontFamily.Serif, fontWeight = FontWeight.Bold)
            }
        }
    }
}

@Preview
@Composable
fun BlablaTripCardpreview() {
    BlablaTripCard(
        blablaTrip = BlablaTrip(
            driverName = "Jake",
            driverPictureUrl = "https://cdn.blablacar.com/search/images/android/filters/two_max_in_the_back.png"
        )
    )
}