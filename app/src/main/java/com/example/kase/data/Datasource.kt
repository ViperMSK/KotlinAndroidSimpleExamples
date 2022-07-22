package com.example.kase.data

import com.example.kase.model.Task

object Datasource {
    var taskList: MutableList<Task> = mutableListOf(
        Task("Default first task", true),
        Task("Default second task", false),
        Task("Default third task", true),
        Task("Default fourth task", false),
        Task("Default fifth task", false),
        Task("Default sixth task", false),
        Task("Default seventh task", false),
        Task("Default eighth task", false),
        Task("Default ninth task", false),
        Task("Default tenth task", false)
    )
}