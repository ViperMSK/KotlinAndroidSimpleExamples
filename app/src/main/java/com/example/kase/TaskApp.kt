package com.example.kase

import android.app.Application
import com.example.kase.data.TaskDatabase

class TaskApp : Application() {
    val sharedDb: TaskDatabase by lazy { TaskDatabase.getDatabase(this) }
}