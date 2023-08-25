package com.example.variasapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("EXTRA_NAME").orEmpty()
        binding.tvResult.text = "Hola, $name"
    }
}