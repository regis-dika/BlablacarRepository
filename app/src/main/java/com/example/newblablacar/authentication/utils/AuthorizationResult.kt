package com.example.newblablacar.authentication.utils

/**
 * Class to handle the different state of authorization => may be in the future an unauthorize object
 */
sealed class AuthorizationResult {
    object Authorize : AuthorizationResult()
    data class AuthorizationFailed(val error: String) : AuthorizationResult()
}
