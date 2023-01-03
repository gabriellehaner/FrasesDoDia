package com.example.frasesdodia

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class InicioFragmento : Fragment (R.layout.inicio_fragmento) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.loginbotao).setOnClickListener {
            findNavController().navigate(R.id.inicioFragmentoparaloginFragmento)
        }

        view.findViewById<Button>(R.id.cadastrobotao).setOnClickListener {
            findNavController().navigate(R.id.inicioFragmentoparacadastroFragmento)
        }
    }

}