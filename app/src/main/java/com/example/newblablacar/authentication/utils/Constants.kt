package com.example.newblablacar.authentication.utils

import com.example.newblablacar.authentication.models.TokenParams

const val TOKEN_URL = "https://edge.blablacar.com/"

val tokenParams = TokenParams(
    "android-technical-tests", "ySs2f1bBssdfNvCrQd782sh19ukNw8i1", "client_credentials",
    listOf("SCOPE_TRIP_DRIVER", "DEFAULT", "SCOPE_INTERNAL_CLIENT")
)

const val ACCESS_TOKEN_KEY = "accessToken"
const val USER_AGENT = "candidate-281-04ef6fba-7b69-4d74-b6fd-44890917084b"