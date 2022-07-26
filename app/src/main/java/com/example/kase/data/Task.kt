package com.example.kase.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks_table")
data class Task(
    @PrimaryKey(autoGenerate = true) val id: Int,
    @NonNull @ColumnInfo(name = "task_text_column") val text: String
)
