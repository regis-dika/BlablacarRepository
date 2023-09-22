package com.example.newblablacar.tripseach.presentation.activities

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.newblablacar.core.utils.resource.Error
import com.example.newblablacar.core.utils.resource.Loading
import com.example.newblablacar.core.utils.resource.Success
import com.example.newblablacar.tripseach.presentation.screens.address.BlablaTripAddressScreen
import com.example.newblablacar.tripseach.presentation.screens.trips.BlablaTripListScreen
import com.example.newblablacar.tripseach.presentation.screens.trips.BlablaTripListViewModel
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
                    val viewModel: BlablaTripListViewModel by viewModels()
                    val state = viewModel.state.collectAsState()
                    val trips = state.value.trips

                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "tripaddress") {
                        composable("tripaddress") {
                            BlablaTripAddressScreen() {
                                navController.navigate("triplist")
                                viewModel.updateFromToAddresses(it.first, it.second)
                                viewModel.fetchTrip()
                            }
                        }
                        composable("triplist") {
                            LaunchedEffect(key1 = trips) {
                                if (trips is Error) {
                                    Toast.makeText(this@MainActivity, trips.msg, Toast.LENGTH_LONG).show()
                                }
                            }

                            when (val results = state.value.trips) {
                                is Loading -> CircularProgressIndicator(modifier = Modifier.fillMaxSize())
                                is Success -> {
                                    BlablaTripListScreen(
                                        blablaTripList = results.value
                                    )
                                }

                                else -> {}
                            }
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