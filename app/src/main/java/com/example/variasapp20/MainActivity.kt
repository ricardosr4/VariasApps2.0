package com.example.variasapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.variasapp20.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnStar.setOnClickListener {
            val name = binding.etName.text.toString()
            if (name.isNotEmpty()) {
                //todo= Asi se declara un intent para pasar a otra pantalla
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("EXTRA_NAME", name)
                startActivity(intent)
            }
        }
    }
}