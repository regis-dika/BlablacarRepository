package com.example.newblablacar.authentication.data

import com.example.newblablacar.BuildConfig
import com.example.newblablacar.authentication.models.TokenParams
import com.example.newblablacar.authentication.models.TokenResponse
import retrofit2.http.Body
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
        "User-Agent: ${BuildConfig.USER_AGENT}"
    )
    @POST("token") // not put the / at the end the POST annotation take it in consideration
    suspend fun getToken(@Body tokenParams: TokenParams): TokenResponse
}