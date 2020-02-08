package com.example.scarletmaps.data

import androidx.lifecycle.MutableLiveData
import com.example.scarletmaps.network.SMQuery
import com.example.scarletmaps.network.ScarletMapsRemoteDataSource
import com.example.scarletmaps.network.ScarletMapsService
import com.google.gson.Gson
import okhttp3.MediaType
import okhttp3.RequestBody
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ScarletMapsRepository @Inject constructor(
    private val remoteDataSource: ScarletMapsRemoteDataSource
) {
    suspend fun getRoutes(): String {
        return remoteDataSource.scarletMapsService.getRoute(RequestBody.create(MediaType.parse("application/json"), Gson().toJson(SMQuery(""))))
    }
}