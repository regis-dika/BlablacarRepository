package com.example.newblablacar.authentication.data

import com.example.newblablacar.authentication.models.TokenParams
import com.example.newblablacar.authentication.models.TokenResponse
import com.example.newblablacar.authentication.utils.TOKEN_URL
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApi {
    @POST(TOKEN_URL)
    suspend fun getToken(@Body tokenParams: TokenParams): TokenResponse
}