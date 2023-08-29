package com.example.variasapp20.IMC

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.example.variasapp20.IMC.IMC.Companion.IMC_KEY
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityResultImcBinding

class ResultIMC : AppCompatActivity() {
    private lateinit var binding: ActivityResultImcBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultImcBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val result = intent.extras?.getDouble(IMC_KEY) ?: -1.0


        initUi(result)
        initListener()


    }

    private fun initUi(result: Double) {
        binding.tvIMC.text = result.toString()
        when(result){
            in 0.00..18.50 ->{  // bajo peso

                binding.tvResult.text= getString(R.string.title_bajo_peso)
                binding.tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_bajo))
                binding.tvDescription.text = getString(R.string.description_bajo_peso)
            }
            in 18.51..24.99 -> { // peso normal

                binding.tvResult.text = getString(R.string.title_normal)
                binding.tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_normal))
                binding.tvDescription.text = getString(R.string.description_normal)
            }
            in 25.00..29.99 -> { // sobre peso

                binding.tvResult.text = getString(R.string.title_sobrepeso)
                binding.tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_sobrepeso))
                binding.tvDescription.text = getString(R.string.description_sobrepeso)
            }
            in 30.00..99.99 -> { // Obesidad

                binding.tvResult.text = getString(R.string.title_obesidad)
                binding.tvResult.setTextColor(ContextCompat.getColor(this,R.color.peso_obesidad))
                binding.tvDescription.text = getString(R.string.description_obesidad)
            }
            else  -> { // error
                binding.tvIMC.text = "error"
                binding.tvResult.text = "error"
                binding.tvDescription.text = "error"
            }

        }


    }

    private fun initListener(){
        binding.btnRecalcular.setOnClickListener { onBackPressed() }

    }



}