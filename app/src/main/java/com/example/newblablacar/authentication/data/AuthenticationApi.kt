package com.example.newblablacar.authentication.data

import com.example.newblablacar.authentication.models.TokenParams
import com.example.newblablacar.authentication.models.TokenResponse
import com.example.newblablacar.authentication.utils.TOKEN_URL
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

/**
 * AuthenticationApi for network request using Retrofit in data module
 */
interface AuthenticationApi {
    /**
     * Headers => settings my request to get the appropriate date set
     */
    @Headers(
        "Content-Type: application/json",
        "User-Agent: candidate-281-04ef6fba-7b69-4d74-b6fd-44890917084b"
    )
    @POST("token") // not put the / at the end the POST annotation take it in consideration
    suspend fun getToken(@Body tokenParams: TokenParams): TokenResponse
}