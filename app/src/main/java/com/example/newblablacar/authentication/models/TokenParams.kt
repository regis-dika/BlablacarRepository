package com.example.newblablacar.authentication.models

data class TokenParams(
    val clientId : String,
    val clientSecret :String,
    val grantType :String,
    val scopes : List<String>? = null
)
