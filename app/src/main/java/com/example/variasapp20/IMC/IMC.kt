package com.example.variasapp20.IMC

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityImcBinding
import java.text.DecimalFormat

class IMC : AppCompatActivity() {
    private lateinit var binding: ActivityImcBinding


    private var currentEdad: Int = 18
    private var currentPeso: Int = 70
    private var currentAltura: Int = 100


    companion object{
        const val IMC_KEY = "IMC_RESULT"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImcBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initListener()



    }



    private fun initListener() {
        binding.rangeSliderAltura.addOnChangeListener { _, value, _ ->
            val df = DecimalFormat("#.##")
            currentAltura = df.format(value).toInt()
            binding.tvAltura.text = "$currentAltura cm"
        }
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
        binding.btnCalcular.setOnClickListener {
            val result = calculateIMC()
            navigateToResult(result)
        }
    }
    private fun setEdad() {
        binding.tvEdad.text = currentEdad.toString()
    }
    private fun setPeso(){
        binding.tvPeso.text = currentPeso.toString()
    }
    private fun navigateToResult(result: Double) {
        val intent = Intent(this, ResultIMC::class.java)
        intent.putExtra(IMC_KEY, result)
        startActivity(intent)
    }

    private fun calculateIMC(): Double {
        val df = DecimalFormat("#.##")
        val imc = currentPeso / (currentAltura.toDouble() / 100 * currentAltura.toDouble() / 100)
        return df.format(imc).toDouble()
    }


}