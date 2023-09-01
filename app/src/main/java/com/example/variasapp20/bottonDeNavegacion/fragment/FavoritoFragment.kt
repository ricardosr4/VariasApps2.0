package com.example.variasapp20.bottonDeNavegacion.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.variasapp20.R
import com.example.variasapp20.databinding.FragmentFavoritoBinding


class FavoritoFragment : Fragment() {
    private lateinit var binding: FragmentFavoritoBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FragmentFavoritoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding.tvTexto.text = "Favoritos"
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_favorito, container, false)
    }


}