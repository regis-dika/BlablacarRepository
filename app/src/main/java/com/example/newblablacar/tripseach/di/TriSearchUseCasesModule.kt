package com.example.newblablacar.tripseach.di

import com.example.newblablacar.core.tripsearch.usescase.GetTripsSearchUseCase
import com.example.newblablacar.tripseach.domain.usecases.GetTripsSearchUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class TriSearchUseCasesModule {

    @Binds
    abstract fun bindGetTripsSearchUseCase(getTripsSearchUseCaseImpl: GetTripsSearchUseCaseImpl): GetTripsSearchUseCase
}