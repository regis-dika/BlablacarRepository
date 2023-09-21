package com.example.newblablacar.authentication.domain

import com.example.newblablacar.authentication.models.TokenResponse

interface AuthenticationRepository {
    suspend fun getToken(): TokenResponse
}