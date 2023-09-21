package com.example.newblablacar.authentication.domain

import com.example.newblablacar.authentication.utils.AuthorizationResult

/**
 * AuthenticationRepository abstraction to use data in different module
 */
interface AuthenticationRepository {
    suspend fun refreshToken(): AuthorizationResult
}