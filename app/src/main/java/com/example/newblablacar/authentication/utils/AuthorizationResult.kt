package com.example.newblablacar.authentication.utils

/**
 * Class to handle the different state of authorization
 */
sealed class AuthorizationResult {
    object Authorize : AuthorizationResult()
    data class AuthorizationFailed(val error: String) : AuthorizationResult()
}
