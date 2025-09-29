package com.jordan.lab_week_05.Api

import com.jordan.lab_week_05.model.ImageData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CatApiService {
    @GET("images/search")
    fun searchImages(
        @Query("limit") limit: Int,
        @Query("size") format: String,
        @Query("has_breeds") logic: Int
    ) : Call<List<ImageData>>

    @GET("images/{id}")
    suspend fun getImageById(@Path("id") imageId: String): Call<List<ImageData>>

}