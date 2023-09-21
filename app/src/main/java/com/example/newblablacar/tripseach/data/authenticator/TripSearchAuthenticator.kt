package com.example.newblablacar.tripseach.data.authenticator

import android.content.SharedPreferences
import com.example.newblablacar.authentication.utils.ACCESS_TOKEN_KEY
import com.example.newblablacar.authentication.utils.AuthorizationResult
import com.example.newblablacar.core.authorization.usescase.GetRefreshTokenUseCase
import kotlinx.coroutines.runBlocking
import okhttp3.Authenticator
import okhttp3.Request
import okhttp3.Response
import okhttp3.Route
import javax.inject.Inject

/**
 * TripSearchAuthenticator => trigger function authenticate when 401 arrive
 * @param getRefreshTokenUseCase use case for trigger the refresh token and save it in local
 * @param sharedPreferences single source of true  for the accessToken
 */
class TripSearchAuthenticator @Inject constructor(
    private val getRefreshTokenUseCase: GetRefreshTokenUseCase,
    private val sharedPreferences: SharedPreferences
) : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? {
        return runBlocking {
            val authorizeResult = getRefreshTokenUseCase.invoke()
            val refreshToken = sharedPreferences.getString(ACCESS_TOKEN_KEY, null)
            //TODO handle error or failed step
            if (authorizeResult is AuthorizationResult.Authorize && refreshToken != null) {
                response.request().newBuilder()
                    .header("Authorization", "Bearer $refreshToken")
                    .build()
            } else {
                null
            }
        }
    }
}