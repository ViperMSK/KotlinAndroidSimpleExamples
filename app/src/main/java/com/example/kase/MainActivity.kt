package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kase.adapter.TaskAdapter
import com.example.kase.data.Datasource
import com.example.kase.databinding.ActivityMainBinding

/**
 * tools:listitem="@layout/task_list_item"
 * app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}