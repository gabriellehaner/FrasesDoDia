package com.example.frasesdodia

import DadosLogin
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.cadastro_fragmento.*

class CadastroFragmento : Fragment(R.layout.cadastro_fragmento) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.botaoconcluircadastro).setOnClickListener {
            DadosLogin.email = emailcampo.text.toString()
            DadosLogin.senha = senhacampo.text.toString()
            DadosLogin.nome = nome.text.toString()
            findNavController().navigate(R.id.cadastroFragmentoparaloginFragmennto)
        }
}}
