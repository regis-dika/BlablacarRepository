package com.example.newblablacar.tripseach.data.models


import com.squareup.moshi.Json

data class Rating(
    @Json(name = "overall")
    val overall: Double,
    @Json(name = "total_number")
    val totalNumber: Int
)