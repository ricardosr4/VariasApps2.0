package com.example.variasapp20.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.IMC.IMC
import com.example.variasapp20.bottonDeNavegacion.ButtomNavigation

import com.example.variasapp20.saludo.MainActivity
import com.example.variasapp20.databinding.ActivityMenuBinding
import com.example.variasapp20.databinding.ActivityTimePickerBinding
import com.example.variasapp20.datePicker.DatePicker
import com.example.variasapp20.timePicker.TimePicker


class Menu : AppCompatActivity() {
    private lateinit var binding: ActivityMenuBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSaludarApp.setOnClickListener { navigateToSaludarApp() }
        binding.btnIMC.setOnClickListener { navigateToIMCApp() }
        binding.btnTimePicker.setOnClickListener { navigateToTimePicker() }
        binding.btnDatePicker.setOnClickListener { navigateToDatePicker() }
        binding.btnButtomNavigation.setOnClickListener { navigateToButtomNavigation() }

    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, IMC::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludarApp() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTimePicker() {
        val intent = Intent(this, TimePicker::class.java)
        startActivity(intent)
    }

    private fun navigateToDatePicker() {
        val intent = Intent(this, DatePicker::class.java)
        startActivity(intent)
    }

    private fun navigateToButtomNavigation(){
        val intent = Intent (this, ButtomNavigation::class.java)
        startActivity(intent)
    }
}