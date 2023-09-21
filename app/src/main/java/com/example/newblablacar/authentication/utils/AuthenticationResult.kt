package com.example.newblablacar.authentication.utils

sealed class AuthenticationResult{
    object Authorize :AuthenticationResult()
    object UnAuthorize :AuthenticationResult()
    object AuthenticationFailed :AuthenticationResult()
}
