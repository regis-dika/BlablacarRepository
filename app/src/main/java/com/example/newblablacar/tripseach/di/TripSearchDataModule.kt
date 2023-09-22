package com.example.newblablacar.tripseach.di

import com.example.newblablacar.tripseach.data.authenticator.TripSearchAuthenticator
import com.example.newblablacar.tripseach.data.interceptor.TripSearchHeaderInterceptor
import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.utils.TRIP_SEARCH_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TripSearchDataModule {

    @Singleton
    @Provides
    fun provideTripSearchApi(okHttpClient: OkHttpClient): TripSearchApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(TRIP_SEARCH_URL)
            .client(okHttpClient)
            .build()
        return retrofit.create(TripSearchApi::class.java)
    }

    @Singleton
    @Provides
    fun provideOkHttp(
        tripSearchHeaderInterceptor: TripSearchHeaderInterceptor,
        tripSearchAuthenticator: TripSearchAuthenticator
    ) = OkHttpClient.Builder()
        .addInterceptor(tripSearchHeaderInterceptor)
        .authenticator(tripSearchAuthenticator)
        .build()
}