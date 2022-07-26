package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.viewmodel.TaskViewModel
import com.example.kase.viewmodel.TaskViewModelFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val viewModel: TaskViewModel by viewModels {
        TaskViewModelFactory((application as TaskApp).sharedDb.taskDao())
    }
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        GlobalScope.launch(Dispatchers.IO) {
            binding.textView.text = viewModel.getAllTasks().toString()
        }
    }
}