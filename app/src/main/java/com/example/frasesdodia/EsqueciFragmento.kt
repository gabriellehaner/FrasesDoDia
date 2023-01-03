package com.example.frasesdodia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

class EsqueciFragmento : Fragment(R.layout.esqueci_fragmento) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.botaoconcluirredefinir).setOnClickListener {
            findNavController().navigate(R.id.esqueciFragmentoparaloginFragmennto)
        }
    }

}