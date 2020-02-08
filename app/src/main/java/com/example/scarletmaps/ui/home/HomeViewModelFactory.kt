package com.example.scarletmaps.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.scarletmaps.data.ScarletMapsRepository
import java.lang.IllegalArgumentException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class HomeViewModelFactory @Inject constructor(var repository: ScarletMapsRepository) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(this.repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}