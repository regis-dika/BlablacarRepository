package com.example.newblablacar.authentication.data

import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.newblablacar.authentication.domain.AuthenticationRepository
import com.example.newblablacar.authentication.utils.ACCESS_TOKEN_KEY
import com.example.newblablacar.authentication.utils.AuthorizationResult
import com.example.newblablacar.authentication.utils.tokenParams
import javax.inject.Inject

/**
 * AuthenticationRepositoryImpl use the Api to populate the token to the domain module with abstraction
 */
class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApi: AuthenticationApi,
    private val sharedPreferences: SharedPreferences
) : AuthenticationRepository {
    override suspend fun refreshToken(): AuthorizationResult {
        return try {
            val result = authenticationApi.getToken(tokenParams)
            sharedPreferences.edit {
                putString(ACCESS_TOKEN_KEY, result.accessToken).commit()
            }
            AuthorizationResult.Authorize
        } catch (e: Exception) {
            AuthorizationResult.AuthorizationFailed(e.toString())
        }

    }
}