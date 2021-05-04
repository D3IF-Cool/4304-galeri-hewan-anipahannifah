package org.d3if3024.galerihewan.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.d3if3024.galerihewan.model.Hewan
import org.d3if3024.galerihewan.R
import org.d3if3024.galerihewan.network.HewanApi
import org.d3if3024.galerihewan.network.HewanApiService

class MainViewModel : ViewModel(){
    private val data = MutableLiveData<List<Hewan>>()
    init {
        retrieveData()

    }
    private fun retrieveData() {
        viewModelScope.launch {
            try {
                data.value = HewanApi.service.getHewan()
            } catch (e: Exception) {
                Log.d("MainViewModel", "Failure: ${e.message}")
            }
        }
    }

    fun getData(): LiveData<List<Hewan>> = data

}