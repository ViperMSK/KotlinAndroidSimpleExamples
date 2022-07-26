package com.example.kase.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addTask(task: Task)

    @Query("SELECT * FROM tasks_table ORDER BY id ASC")
    fun fetchAllTasks(): List<Task>
}