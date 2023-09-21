package com.example.newblablacar.authentication.models

import com.squareup.moshi.Json

data class TokenParams(
    @Json(name = "client_id")
    val clientId: String,
    @Json(name = "client_secret")
    val clientSecret: String,
    @Json(name = "grant_type")
    val grantType: String,
    @Json(name = "scopes")
    val scopes: List<String>? = null
)
