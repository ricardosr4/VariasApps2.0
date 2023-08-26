package com.example.variasapp20.IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityImcBinding

class IMC : AppCompatActivity() {
    private lateinit var binding: ActivityImcBinding


    private var currentEdad: Int = 18
    private var currentPeso: Int = 70


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initListener()



    }



    private fun initListener() {
        binding.btnMenorEdad.setOnClickListener {
            currentEdad -= 1
            setEdad()
        }
        binding.btnMayorEdad.setOnClickListener {
            currentEdad += 1
            setEdad()
        }
        binding.btnMenorPeso.setOnClickListener {
            currentPeso -= 1
            setPeso()
        }
        binding.btnMayorPeso.setOnClickListener {
            currentPeso += 1
            setPeso()
        }
    }
    private fun setEdad() {
        binding.tvEdad.text = currentEdad.toString()
    }
    private fun setPeso(){
        binding.tvPeso.text = currentPeso.toString()
    }


}