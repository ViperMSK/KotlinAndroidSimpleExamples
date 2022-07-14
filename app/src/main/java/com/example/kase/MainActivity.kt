package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.network.MarsApi
import kotlinx.coroutines.launch

/**
 * internet-permission
 * viewBinding & dataBinding (lifecycleScope)
 * implementation "com.squareup.retrofit2:retrofit:2.9.0"
 * implementation "com.squareup.retrofit2:converter-scalars:2.9.0"
 */

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycleScope.launch {
            try {
                binding.progressBar.isVisible = true
                binding.textView.text = MarsApi.retrofitService.getPhotos()
                binding.progressBar.isVisible = false
            } catch (e: Exception) {
                binding.progressBar.isVisible = false
                binding.textView.text = "Unable to load data!"
            }
        }
    }
}