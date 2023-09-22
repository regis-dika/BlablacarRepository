package com.example.newblablacar.tripseach.di

import com.example.newblablacar.tripseach.data.authenticator.TripSearchAuthenticator
import com.example.newblablacar.tripseach.data.interceptor.TripSearchHeaderInterceptor
import com.example.newblablacar.tripseach.data.remote.TripSearchApi
import com.example.newblablacar.tripseach.utils.TRIP_SEARCH_URL
import com.squareup.moshi.Moshi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TripSearchDataModule {

    @Singleton
    @Provides
    fun provideTripSearchApi(moshi: Moshi,okHttpClient: OkHttpClient): TripSearchApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(TRIP_SEARCH_URL)
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .client(okHttpClient)
            .build()
        return retrofit.create(TripSearchApi::class.java)
    }

    /**
     * Add interceptor and authenticator in client
     */
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