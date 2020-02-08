package com.example.scarletmaps.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.scarletmaps.data.ScarletMapsRepository
import javax.inject.Inject

class HomeViewModel @Inject constructor(val repository: ScarletMapsRepository) : ViewModel() {
    val name: LiveData<String> = liveData {
        val res = repository.getRoutes()
        emit(res)
    }

}