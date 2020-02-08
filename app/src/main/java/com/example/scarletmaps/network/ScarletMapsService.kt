package com.example.scarletmaps.network

import com.example.scarletmaps.data.models.Stop
import okhttp3.RequestBody
import retrofit2.http.*

interface ScarletMapsService {

    @POST("/graphql")
    suspend fun getRoute(@Body query: RequestBody): String

    @GET("/")
    suspend fun getResponse(): String


}

data class SMQuery(
    val query: String
)