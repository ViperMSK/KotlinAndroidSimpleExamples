package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.lifecycle.coroutineScope
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.viewmodel.TaskViewModel
import com.example.kase.viewmodel.TaskViewModelFactory
import kotlinx.coroutines.launch

/**
 * id 'kotlin-kapt' (queries)
 * implementation "androidx.fragment:fragment-ktx:1.5.0" (viewModels)
 * implementation "androidx.room:room-runtime:2.4.2"
 * implementation "androidx.room:room-ktx:2.4.2"
 * kapt "androidx.room:room-compiler:2.4.2"
 */

class MainActivity : AppCompatActivity() {
    private val viewModel: TaskViewModel by viewModels {
        TaskViewModelFactory((application as TaskApp).sharedDb.taskDao())
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        lifecycle.coroutineScope.launch {
            viewModel.getAllTasks().collect(){
                binding.textView.text = it.toString()
            }
        }
    }
}