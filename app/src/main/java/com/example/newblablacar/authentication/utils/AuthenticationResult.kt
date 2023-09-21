package com.example.newblablacar.authentication.utils

sealed class AuthenticationResult {
    object Authorize : AuthenticationResult()
    object UnAuthorize : AuthenticationResult()
    data class AuthenticationFailed(val error: String) : AuthenticationResult()
}
