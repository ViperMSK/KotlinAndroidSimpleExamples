package com.example.kase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        binding.textView.setOnClickListener {
            showAlertDialog()
        }
    }

    private fun showAlertDialog() {
        MaterialAlertDialogBuilder(this)
            .setTitle("Question")
            .setMessage("YES or NO?")
            .setCancelable(false)
            .setNegativeButton("[NO]") { _, _ ->
                Toast.makeText(this, "The answer is NO", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("[YES]") { _, _ ->
                Toast.makeText(this, "The answer is YES", Toast.LENGTH_SHORT).show()
            }
            .show()
    }
}