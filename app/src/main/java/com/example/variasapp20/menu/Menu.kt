package com.example.variasapp20.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.MainActivity
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityMenuBinding

class Menu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}