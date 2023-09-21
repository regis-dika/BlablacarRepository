package com.example.newblablacar.core.authorization.usescase

import com.example.newblablacar.authentication.utils.AuthorizationResult

interface GetRefreshTokenUseCase {
    suspend fun invoke(): AuthorizationResult
}