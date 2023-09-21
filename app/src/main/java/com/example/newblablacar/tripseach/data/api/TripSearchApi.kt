package com.example.newblablacar.tripseach.data.api

import com.example.newblablacar.tripseach.data.models.TripSearchParams
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET

interface TripSearchApi {
    @GET("search")
    suspend fun getTrips(@Body tripSearchParams: TripSearchParams): ResponseBody
}