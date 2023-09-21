package com.example.newblablacar.authentication.di

import com.example.newblablacar.authentication.domain.usescases.GetRefreshTokenUseCaseImpl
import com.example.newblablacar.core.authorization.usescase.GetRefreshTokenUseCase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AuthenticationUseCasesModule {

    @Binds
    abstract fun bindGetRefreshTokenUseCase(getRefreshTokenUseCaseImpl: GetRefreshTokenUseCaseImpl): GetRefreshTokenUseCase
}