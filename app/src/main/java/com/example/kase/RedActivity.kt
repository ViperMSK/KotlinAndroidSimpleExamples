package com.example.kase

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.kase.databinding.ActivityRedBinding
import com.example.kase.databinding.ActivityYellowBinding

class RedActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.extras?.get("KEY")
        binding.textView.text = "${binding.textView.text} + $message"

        binding.buttonMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("KEY", "Hello from RedActivity!")
            startActivity(intent)
        }

        binding.buttonRed.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            intent.putExtra("KEY", "Hello from RedActivity!")
            startActivity(intent)
        }

        binding.buttonGreen.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            intent.putExtra("KEY", "Hello from RedActivity!")
            startActivity(intent)
        }

        binding.buttonBlue.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            intent.putExtra("KEY", "Hello from RedActivity!")
            startActivity(intent)
        }

        binding.buttonYellow.setOnClickListener {
            val intent = Intent(this, YellowActivity::class.java)
            intent.putExtra("KEY", "Hello from RedActivity!")
            startActivity(intent)
        }

        binding.buttonExit.setOnClickListener {
            finish()
        }
    }
}