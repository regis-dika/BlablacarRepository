package com.example.newblablacar.core.authorization.usescase

import com.example.newblablacar.authentication.utils.AuthorizationResult

/**
 * Abstraction for use this usecase in other modules
 */
interface GetRefreshTokenUseCase {
    suspend fun invoke(): AuthorizationResult
}