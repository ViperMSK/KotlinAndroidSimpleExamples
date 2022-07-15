package com.example.kase.model

import android.graphics.Color
import android.widget.TextView
import androidx.databinding.BindingAdapter

@BindingAdapter("digitColor")
    fun digitColor(view: TextView, number: Int) {
        when (number) {
            1 -> view.setTextColor(Color.CYAN)
            2 -> view.setTextColor(Color.MAGENTA)
            else -> view.setTextColor(Color.BLACK)
        }
    }