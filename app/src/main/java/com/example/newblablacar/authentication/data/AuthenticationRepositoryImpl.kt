package com.example.newblablacar.authentication.data

import android.content.SharedPreferences
import androidx.core.content.edit
import com.example.newblablacar.authentication.domain.AuthenticationRepository
import com.example.newblablacar.authentication.utils.AuthenticationResult
import com.example.newblablacar.authentication.utils.tokenParams
import javax.inject.Inject

/**
 * AuthenticationRepositoryImpl use the Api to populate the token to the domain module with abstraction
 */
class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApi: AuthenticationApi,
    private val sharedPreferences: SharedPreferences
) : AuthenticationRepository {
    override suspend fun refreshToken(): AuthenticationResult {
        return try {
            val result = authenticationApi.getToken(tokenParams)
            sharedPreferences.edit {
                putString("accessToken", result.accessToken).commit()
            }
            AuthenticationResult.Authorize
        } catch (e: Exception) {
            AuthenticationResult.AuthenticationFailed(e.toString())
        }

    }
}