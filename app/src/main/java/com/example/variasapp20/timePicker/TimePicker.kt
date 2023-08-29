package com.example.variasapp20.timePicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityTimePickerBinding

class TimePicker : AppCompatActivity() {
    private lateinit var binding: ActivityTimePickerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etTime.setOnClickListener { showTimePickerDialog() }
    }

    private fun showTimePickerDialog() {
        val timePicker = TimePickerFragment{onTimeSelected(it)}
        timePicker.show(supportFragmentManager, "time")

    }
    private fun onTimeSelected(time:String){
        binding.etTime.setText("has seleccionado las $time")

    }
}