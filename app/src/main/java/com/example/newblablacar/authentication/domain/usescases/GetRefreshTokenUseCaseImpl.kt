package com.example.newblablacar.authentication.domain.usescases

import com.example.newblablacar.authentication.domain.AuthenticationRepository
import com.example.newblablacar.authentication.utils.AuthorizationResult
import com.example.newblablacar.core.authorization.usescase.GetRefreshTokenUseCase
import javax.inject.Inject

/**
 * Use case implementation to trigger the refresh token
 */
class GetRefreshTokenUseCaseImpl @Inject constructor(
    private val authenticationRepository: AuthenticationRepository
) : GetRefreshTokenUseCase {
    override suspend fun invoke(): AuthorizationResult {
        return authenticationRepository.refreshToken()
    }
}