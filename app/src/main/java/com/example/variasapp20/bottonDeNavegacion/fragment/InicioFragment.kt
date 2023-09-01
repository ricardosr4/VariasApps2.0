package com.example.variasapp20.bottonDeNavegacion.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.variasapp20.R
import com.example.variasapp20.databinding.FragmentInicioBinding


class InicioFragment : Fragment() {

    private lateinit var binding: FragmentInicioBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentInicioBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.tvTexto.text = "inicio"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false)
    }


}