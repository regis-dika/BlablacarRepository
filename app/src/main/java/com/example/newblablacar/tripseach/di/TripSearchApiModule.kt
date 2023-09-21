package com.example.newblablacar.tripseach.di

import com.example.newblablacar.tripseach.data.api.TripSearchApi
import com.example.newblablacar.tripseach.utils.TRIP_SEARCH_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object TripSearchApiModule {

    @Singleton
    @Provides
    fun provideTripSearchApi(): TripSearchApi {
        val retrofit = Retrofit.Builder()
            .baseUrl(TRIP_SEARCH_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

        return retrofit.create(TripSearchApi::class.java)
    }
}