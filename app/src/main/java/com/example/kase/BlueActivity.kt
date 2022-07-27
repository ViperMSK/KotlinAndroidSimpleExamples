package com.example.kase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kase.databinding.ActivityBlueBinding
import com.example.kase.databinding.ActivityMainBinding

class BlueActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBlueBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlueBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.extras?.get("KEY")
        binding.textView.text = "${binding.textView.text} + $message"

        binding.buttonMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("KEY", "Hello from BlueActivity!")
            startActivity(intent)
        }

        binding.buttonRed.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            intent.putExtra("KEY", "Hello from BlueActivity!")
            startActivity(intent)
        }
        binding.buttonGreen.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            intent.putExtra("KEY", "Hello from BlueActivity!")
            startActivity(intent)
        }
        binding.buttonBlue.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            intent.putExtra("KEY", "Hello from BlueActivity!")
            startActivity(intent)
        }
        binding.buttonYellow.setOnClickListener {
            val intent = Intent(this, YellowActivity::class.java)
            intent.putExtra("KEY", "Hello from BlueActivity!")
            startActivity(intent)
        }
        binding.buttonExit.setOnClickListener {
            finish()
        }
    }
}