package com.example.newblablacar.authentication.utils

import com.example.newblablacar.authentication.models.TokenParams

val tokenParams = TokenParams(
    "android-technical-tests", "ySs2f1bBssdfNvCrQd782sh19ukNw8i1", "client_credentials",
    listOf("SCOPE_TRIP_DRIVER", "DEFAULT", "SCOPE_INTERNAL_CLIENT")
)

const val ACCESS_TOKEN_KEY = "accessToken"