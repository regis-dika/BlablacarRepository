package com.example.newblablacar.authentication.di

import com.example.newblablacar.authentication.data.AuthenticationApi
import com.example.newblablacar.authentication.utils.TOKEN_URL
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthenticationModule {
    @Singleton
    fun provideAuthenticationApi(): AuthenticationApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(TOKEN_URL)
            .build()
        return retrofit.create(AuthenticationApi::class.java)
    }
}