package com.example.newblablacar

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.lifecycleScope
import com.example.newblablacar.authentication.domain.AuthenticationRepository
import com.example.newblablacar.authentication.utils.ACCESS_TOKEN_KEY
import com.example.newblablacar.ui.theme.NewBlablacarTheme
import dagger.hilt.android.AndroidEntryPoint
import dagger.internal.InjectedFieldSignature
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var authenticationRepository: AuthenticationRepository

    @Inject
    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewBlablacarTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    lifecycleScope.launch {
                        val token = authenticationRepository.refreshToken()
                        val accessToken = sharedPreferences.getString(ACCESS_TOKEN_KEY, "no token available")
                        Toast.makeText(this@MainActivity, token.javaClass.name, Toast.LENGTH_SHORT).show()
                        Toast.makeText(this@MainActivity, accessToken, Toast.LENGTH_LONG).show()
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