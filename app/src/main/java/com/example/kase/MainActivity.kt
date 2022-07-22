package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kase.adapter.TaskAdapter
import com.example.kase.data.Datasource.taskList
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.model.Task

/**
 * tools:listitem="@layout/task_list_item"
 * app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var adapter = TaskAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter.submitList(taskList)

        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.setHasFixedSize(true)

            button.setOnClickListener {
                addNewTask(Task("New task in second position!", false))
            }
        }
    }

    private fun addNewTask(newTask: Task) {
        var newList: MutableList<Task>? = taskList.toMutableList()
        newList?.add(1, newTask)
        adapter.submitList(newList)
        taskList = newList!!
        newList = null
    }
}