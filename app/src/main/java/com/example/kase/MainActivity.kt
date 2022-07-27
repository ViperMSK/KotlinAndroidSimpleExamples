package com.example.kase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kase.databinding.ActivityMainBinding

/**
 * android:launchMode=""
 * android:label=""
 * android:parentActivityName=".MainActivity" (back press navigation)
 */

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.extras?.get("KEY")
        if (message != null) {
            binding.textView.text = "${binding.textView.text} + $message"
        }

        binding.buttonMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("KEY", "Hello from MainActivity!")
            startActivity(intent)
        }

        binding.buttonRed.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            intent.putExtra("KEY", "Hello from MainActivity!")
            startActivity(intent)
        }
        binding.buttonGreen.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            intent.putExtra("KEY", "Hello from MainActivity!")
            startActivity(intent)
        }
        binding.buttonBlue.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            intent.putExtra("KEY", "Hello from MainActivity!")
            startActivity(intent)
        }
        binding.buttonYellow.setOnClickListener {
            val intent = Intent(this, YellowActivity::class.java)
            intent.putExtra("KEY", "Hello from MainActivity!")
            startActivity(intent)
        }
        binding.buttonExit.setOnClickListener {
            finish()
        }
    }
}