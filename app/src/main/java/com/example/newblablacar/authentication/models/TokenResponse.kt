package com.example.newblablacar.authentication.models


import com.squareup.moshi.Json

data class TokenResponse(
    @Json(name = "access_token")
    val accessToken: String,
    @Json(name = "client_id")
    val clientId: String,
    @Json(name = "expires_in")
    val expiresIn: Int,
    @Json(name = "issued_at")
    val issuedAt: Int,
    @Json(name = "scopes")
    val scopes: List<String>,
    @Json(name = "token_type")
    val tokenType: String
)