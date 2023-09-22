package com.example.newblablacar.tripseach.di

import com.example.newblablacar.tripseach.data.repository.TripSearchRepositoryImpl
import com.example.newblablacar.tripseach.domain.models.TripSearchRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class TripSearchRepositoryModule {

    @Binds
    abstract fun bindTripSearchRepository(tripSearchRepositoryImpl: TripSearchRepositoryImpl): TripSearchRepository
}