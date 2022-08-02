package com.example.kase.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.kase.R
import com.example.kase.RVFragmentDirections
import com.example.kase.model.Task

class TaskAdapter(private val taskList: List<Task>) :
    RecyclerView.Adapter<TaskAdapter.TaskViewHolder>() {

    inner class TaskViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.textView)
        val checkBox: CheckBox = view.findViewById(R.id.checkBox)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TaskViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.task_list_item, parent, false)
        return TaskViewHolder(view)
    }

    override fun onBindViewHolder(holder: TaskViewHolder, position: Int) {
        holder.textView.text = taskList[position].taskText
        holder.checkBox.isChecked = taskList[position].isDone

        holder.textView.setOnClickListener {
            val action = RVFragmentDirections.actionRVFragmentToDetailFragment(taskList[position].taskText)
            holder.view.findNavController().navigate(action)
        }
    }

    override fun getItemCount() = taskList.size
}