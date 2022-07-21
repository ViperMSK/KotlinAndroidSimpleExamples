package com.example.kase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.kase.R
import com.example.kase.databinding.TaskListItemBinding
import com.example.kase.model.Task

class TaskAdapter(private val taskList: List<Task>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    class TaskViewHolder(private val binding: TaskListItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(task: Task) {
            binding.textView.text = task.taskText
            binding.checkBox.isChecked = task.isDone
        }
    }

    /**
     * Create new [RecyclerView] item views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        return TaskViewHolder(
            TaskListItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    /**
     * Replaces the contents of a view (invoked by the layout manager)
     */
    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.bind(taskList[position])
    }

    override fun getItemCount() = taskList.size

//    ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^
//    override fun getItemCount(): Int {
//        return taskList.size
//    }
}