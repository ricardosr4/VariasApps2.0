package com.example.variasapp20.bottonDeNavegacion

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.variasapp20.R
import com.example.variasapp20.databinding.ActivityButtomNavigationBinding

class ButtomNavigation : AppCompatActivity() {
    private lateinit var binding: ActivityButtomNavigationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityButtomNavigationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupNavegacion()
    }

    private fun setupNavegacion() {
        val bottomNavigationView = binding.bottomNavigationView
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(
            bottomNavigationView,
            navHostFragment.navController
        )

    }

}
