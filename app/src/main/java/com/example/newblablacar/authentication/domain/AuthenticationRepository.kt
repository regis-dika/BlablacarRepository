package com.example.newblablacar.authentication.domain

import com.example.newblablacar.authentication.models.TokenResponse

/**
 * AuthenticationRepository abstraction to use data in different module
 */
interface AuthenticationRepository {
    suspend fun getToken(): TokenResponse
}