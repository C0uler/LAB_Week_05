package com.jordan.lab_week_05.model

import com.squareup.moshi.Json

data class ImageData(
    @field:Json(name = "url") val imageUrl: String,
    @field:Json(name = "breeds[0]") val breeds: List<CatBreedData>
)