package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kase.adapter.TaskAdapter
import com.example.kase.data.Datasource
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.model.Task

/**
 * tools:listitem="@layout/task_list_item"
 * app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = TaskAdapter(Datasource.taskList)

        binding.apply {
            recyclerView.adapter = adapter
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.setHasFixedSize(true)

            button.setOnClickListener {
                val oldList: List<Task> = Datasource.taskList.toList()
                Datasource.taskList.add(1, Task("New task in second position!", false))
                adapter.updateList(oldList)
            }
        }
    }
}