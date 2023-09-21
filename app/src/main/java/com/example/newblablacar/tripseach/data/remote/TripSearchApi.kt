package com.example.newblablacar.tripseach.data.remote

import com.example.newblablacar.tripseach.data.models.TripSearchParams
import okhttp3.ResponseBody
import retrofit2.http.Body
import retrofit2.http.GET

interface TripSearchApi {
    @GET("search")
    suspend fun tripSearch(@Body tripSearchParams: TripSearchParams): ResponseBody
}