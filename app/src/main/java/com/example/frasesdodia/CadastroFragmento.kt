package com.example.frasesdodia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class CadastroFragmento : Fragment(R.layout.cadastro_fragmento) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.botaoconcluircadastro).setOnClickListener {
            findNavController().navigate(R.id.cadastroFragmentoparaloginFragmennto)
        }
}}
