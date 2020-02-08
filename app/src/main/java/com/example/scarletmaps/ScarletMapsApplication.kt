package com.example.scarletmaps

import android.app.Application
import com.example.scarletmaps.di.DaggerScarletmapsComponent
import javax.inject.Singleton

@Singleton
class ScarletMapsApplication : Application() {
    val appComponent by lazy {
        DaggerScarletmapsComponent.factory().create(applicationContext)
    }
}