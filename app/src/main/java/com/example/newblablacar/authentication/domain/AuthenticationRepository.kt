package com.example.newblablacar.authentication.domain

import com.example.newblablacar.authentication.utils.AuthenticationResult

/**
 * AuthenticationRepository abstraction to use data in different module
 */
interface AuthenticationRepository {
    suspend fun refreshToken(): AuthenticationResult
}