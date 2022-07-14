package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import androidx.core.view.isVisible
import androidx.lifecycle.lifecycleScope
import coil.load
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.network.MarsApi
import com.example.kase.network.MarsPhoto
import kotlinx.coroutines.launch

/**
 * internet-permission
 * viewBinding & dataBinding (lifecycleScope)
 * implementation 'com.squareup.retrofit2:converter-moshi:2.9.0'
 * implementation 'com.squareup.moshi:moshi-kotlin:1.13.0'
 * implementation "io.coil-kt:coil:1.1.1"
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
                val allPhotos: List<MarsPhoto> = MarsApi.retrofitService.getPhotos()
                binding.progressBar.isVisible = false

                val firstImgUrl = allPhotos[0].imageSrcUrl
                val imgUri = firstImgUrl.toUri().buildUpon().scheme("https").build()

                binding.imageView.load(imgUri) {
                    placeholder(R.drawable.loading_animation)
                    error(R.drawable.ic_broken_image)
                }
            } catch (e: Exception) {
                binding.imageView.setImageResource(R.drawable.ic_broken_image)
            }
        }
    }
}