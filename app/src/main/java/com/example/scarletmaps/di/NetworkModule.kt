package com.example.scarletmaps.di

import com.example.scarletmaps.network.ScarletMapsService
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
class NetworkModule {
    @Provides
    fun provideScarletMapsService(): ScarletMapsService {


        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .baseUrl("https://api.scarletbus.com")
            .build()
            .create(ScarletMapsService::class.java)
    }
}