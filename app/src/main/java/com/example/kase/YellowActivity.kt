package com.example.kase

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kase.databinding.ActivityMainBinding
import com.example.kase.databinding.ActivityYellowBinding

class YellowActivity : AppCompatActivity() {
    private lateinit var binding: ActivityYellowBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityYellowBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val message = intent.extras?.get("KEY")
        binding.textView.text = "${binding.textView.text} + $message"

        binding.buttonMain.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("KEY", "Hello from YellowActivity!")
            startActivity(intent)
        }

        binding.buttonRed.setOnClickListener {
            val intent = Intent(this, RedActivity::class.java)
            intent.putExtra("KEY", "Hello from YellowActivity!")
            startActivity(intent)
        }
        binding.buttonGreen.setOnClickListener {
            val intent = Intent(this, GreenActivity::class.java)
            intent.putExtra("KEY", "Hello from YellowActivity!")
            startActivity(intent)
        }
        binding.buttonBlue.setOnClickListener {
            val intent = Intent(this, BlueActivity::class.java)
            intent.putExtra("KEY", "Hello from YellowActivity!")
            startActivity(intent)
        }
        binding.buttonYellow.setOnClickListener {
            val intent = Intent(this, YellowActivity::class.java)
            intent.putExtra("KEY", "Hello from YellowActivity!")
            startActivity(intent)
        }
        binding.buttonExit.setOnClickListener {
            finish()
        }

    }
}