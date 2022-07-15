package com.example.kase.model

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class NumberViewModel : ViewModel() {
    var _digit = MutableLiveData<Int>()

    val digit: LiveData<Int>
        get() = _digit

    init {
        _digit.value = 0
    }

    fun setNumber(number: Int) {
        _digit.value = number
    }
}