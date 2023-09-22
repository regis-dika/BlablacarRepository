package com.example.newblablacar.tripseach.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Send
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedIconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BlablaTripAddressScreen(
    fromAddress: String,
    toAddress: String,
    onGoClick: (() -> Unit)
) {
    var fromAddress by rememberSaveable() {
        mutableStateOf("")
    }
    var toAddress by rememberSaveable() {
        mutableStateOf("")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        OutlinedTextField(value = fromAddress, onValueChange = {
            fromAddress = it
        })

        OutlinedTextField(value = toAddress, onValueChange = {
            toAddress = it
        })
        OutlinedIconButton(onClick = { onGoClick.invoke() }) {
            Icon(imageVector = Icons.Rounded.Send, contentDescription = "send")
        }
    }
}