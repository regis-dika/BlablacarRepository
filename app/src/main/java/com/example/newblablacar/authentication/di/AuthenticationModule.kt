package com.example.newblablacar.authentication.di

import android.app.Application
import android.content.Context.MODE_PRIVATE
import com.example.newblablacar.authentication.data.AuthenticationApi
import com.example.newblablacar.authentication.utils.TOKEN_URL
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AuthenticationModule {
    @Singleton
    @Provides
    fun provideAuthenticationApi(moshi: Moshi): AuthenticationApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(TOKEN_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
        return retrofit.create(AuthenticationApi::class.java)
    }

    @Singleton
    @Provides
    fun provideSharedPreference(application: Application) =
        application.getSharedPreferences("sharedPrefs", MODE_PRIVATE)
}