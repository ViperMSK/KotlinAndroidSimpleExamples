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

        binding.apply {
            val adapter = TaskAdapter()
            recyclerView.adapter = adapter
            adapter.updateList(Datasource.taskList)
            recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerView.setHasFixedSize(true)

            button.setOnClickListener {
                var newList: MutableList<Task>? = Datasource.taskList.toList() as MutableList<Task>
                newList!!.add(1, Task("New task in second position!", false))
                adapter.updateList(newList)
                Datasource.taskList = newList
                newList = null
            }
        }
    }
}