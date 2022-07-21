package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.model.NumberViewModel

/**
 * viewBinding
 * implementation 'androidx.fragment:fragment-ktx:1.5.0' (for viewModels())
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val numberViewModel: NumberViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        numberViewModel.number.observe(this) {
            binding.textView.text = numberViewModel.number.value.toString()
        }

        binding.button1.setOnClickListener {
            numberViewModel.setNumber(1)
        }

        binding.button2.setOnClickListener {
            numberViewModel.setNumber(2)
        }
    }
}