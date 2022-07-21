package com.example.kase.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberViewModel : ViewModel() {
    var _number = MutableLiveData<Int>()

    val number: LiveData<Int>
        get() = _number

    init {
        _number.value = 0
    }

    fun setNumber(number: Int) {
        _number.value = number
    }
}