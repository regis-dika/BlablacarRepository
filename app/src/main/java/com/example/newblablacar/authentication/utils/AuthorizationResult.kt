package com.example.newblablacar.authentication.utils

sealed class AuthorizationResult {
    object Authorize : AuthorizationResult()
    data class AuthorizationFailed(val error: String) : AuthorizationResult()
}
