package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.kase.databinding.ActivityMainBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import java.lang.System.exit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.overflow_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.option_1 -> Toast.makeText(this, "Option 1 selected", Toast.LENGTH_SHORT).show()
            R.id.option_2 -> Toast.makeText(this, "Option 2 selected", Toast.LENGTH_SHORT).show()
            R.id.option_21 -> Toast.makeText(this, "Option 2.1 selected", Toast.LENGTH_SHORT).show()
            R.id.option_22 -> Toast.makeText(this, "Option 2.2 selected", Toast.LENGTH_SHORT).show()
            R.id.option_23 -> Toast.makeText(this, "Option 2.3 selected", Toast.LENGTH_SHORT).show()
            R.id.option_3 -> Toast.makeText(this, "Option 3 selected", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}