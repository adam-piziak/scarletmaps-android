package com.example.scarletmaps.di

import android.content.Context
import com.example.scarletmaps.ui.MainActivity
import com.example.scarletmaps.ui.home.HomeFragment
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class])
interface ScarletmapsComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ScarletmapsComponent
    }

    fun inject(activity: MainActivity)
    fun inject(fragment: HomeFragment)

}