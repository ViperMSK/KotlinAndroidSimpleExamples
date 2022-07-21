package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.model.NumberViewModel

/**
 * viewBinding & dataBinding
 * implementation 'androidx.fragment:fragment-ktx:1.5.0' (for viewModels())
 * convert activity_main to data binding layout
 * plugin id 'kotlin-kapt' (for BindingAdapters)
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val numberViewModel: NumberViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        binding.viewModel = numberViewModel

        setContentView(binding.root)
    }
}