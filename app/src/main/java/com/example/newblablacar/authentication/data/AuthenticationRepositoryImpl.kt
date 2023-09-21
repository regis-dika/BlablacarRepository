package com.example.newblablacar.authentication.data

import com.example.newblablacar.authentication.domain.AuthenticationRepository
import com.example.newblablacar.authentication.models.TokenResponse
import com.example.newblablacar.authentication.utils.tokenParams
import javax.inject.Inject

/**
 * AuthenticationRepositoryImpl use the Api to populate the token to the domain module with abstraction
 */
class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApi: AuthenticationApi
) : AuthenticationRepository {
    override suspend fun getToken(): TokenResponse {
       return authenticationApi.getToken(tokenParams)
    }
}