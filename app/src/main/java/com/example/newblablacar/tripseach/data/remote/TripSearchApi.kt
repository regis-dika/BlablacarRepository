package com.example.newblablacar.tripseach.data.remote

import com.example.newblablacar.tripseach.data.models.BlalaTripsDto
import okhttp3.ResponseBody
import retrofit2.http.GET
import retrofit2.http.Query

interface TripSearchApi {
    @GET("search/v7")
    suspend fun tripSearch(
        @Query("from_address") fromAddress: String,
        @Query("to_address") toAddress: String,
        @Query("search_uuid") searchUuid: String,
        @Query("from_cursor") fromCursor: String?
    ): BlalaTripsDto
}