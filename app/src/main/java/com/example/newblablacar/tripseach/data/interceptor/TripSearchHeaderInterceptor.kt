package com.example.newblablacar.tripseach.data.interceptor

import android.content.SharedPreferences
import com.example.newblablacar.authentication.utils.ACCESS_TOKEN_KEY
import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response
import javax.inject.Inject

/**
 * TripSearchHeaderInterceptor Intercept OkHttpRequest and add it header values => not use an annotation header because it's difficult to maintain for all requests
 */
class TripSearchHeaderInterceptor @Inject constructor(
    private val sharedPreferences: SharedPreferences
) : Interceptor {
    override fun intercept(chain: Chain): Response {
        val accessToken = sharedPreferences.getString(ACCESS_TOKEN_KEY, null)
        val request = chain.request()
            .newBuilder()
            .header("Authorization", "Bearer $accessToken")
            .header("User-Agent", "candidate-281-04ef6fba-7b69-4d74-b6fd-44890917084b")
            .header("X-Locale", "fr_FR")
            .header("X-Visitor-Id", "8401658C-E98D-457E-A087-34FA2D979D69")
            .header("X-Currency", "EUR")
            .header("X-Client", "Android|1.2.3")
            .build()
        return chain.proceed(request)
    }
}