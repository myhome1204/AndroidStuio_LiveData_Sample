package com.example.viewmodel_livedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExampleViewModel : ViewModel() {
    private val _testLiveData : MutableLiveData<Int>  = MutableLiveData(0)
    val testLiveData : LiveData<Int> = _testLiveData
    fun plusOne() :Unit{
        val currentLiveData = _testLiveData.value
        if (currentLiveData != null){
            _testLiveData.value = currentLiveData +1
        }
    }
}