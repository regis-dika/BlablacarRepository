package com.example.newblablacar.tripseach.presentation.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newblablacar.tripseach.domain.models.BlablaTrip
import com.example.newblablacar.tripseach.presentation.screens.BlablaTripAddressScreen
import com.example.newblablacar.tripseach.presentation.screens.BlablaTripListScreen
import com.example.newblablacar.ui.theme.NewBlablacarTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewBlablacarTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "tripaddress") {
                        composable("tripaddress") {
                            BlablaTripAddressScreen(navController)
                        }
                        composable("triplist") {
                            BlablaTripListScreen(
                                trips = listOf(
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
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NewBlablacarTheme {
        Greeting("Android")
    }
}