package com.example.kase.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kase.data.Task
import com.example.kase.data.TaskDao
import kotlinx.coroutines.flow.Flow

class TaskViewModel(private val taskDao: TaskDao): ViewModel() {
    fun getAllTasks(): Flow<List<Task>> = taskDao.fetchAllTasks()
}

class TaskViewModelFactory(
    private val taskDao: TaskDao
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(TaskViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TaskViewModel(taskDao) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}