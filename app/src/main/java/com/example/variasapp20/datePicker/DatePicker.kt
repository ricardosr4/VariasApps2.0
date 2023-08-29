package com.example.variasapp20.datePicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityDatePickerBinding

class DatePicker : AppCompatActivity() {
    private lateinit var binding: ActivityDatePickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDatePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etDate.setOnClickListener { showDatePickerDialog() }
    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerFragment{day, month, year -> onDateSelected(day, month, year)}
        datePicker.show(supportFragmentManager, "Date Picker")

    }
    private fun onDateSelected(day:Int, month:Int, year:Int){
        binding.etDate.setText("El Dia $day del Mes $month del Año $year")

    }
}