package com.example.frasesdodia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class LoginFragmennto : Fragment(R.layout.login_fragmennto) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        view.findViewById<Button>(R.id.botaofazerlogin).setOnClickListener {
          //  findNavController().navigate(R.id.loginFragmentoparahomeFragmento)
            login()
        }

        view.findViewById<Button>(R.id.botaoesquecisenha).setOnClickListener {
            findNavController().navigate(R.id.loginFragmentoparaesqueciFragmento)
        }


    }

    private fun login() {

        val emailCorreto:  Boolean = DadosLogin.email == view?.findViewById<EditText>(R.id.campoemail)?.text.toString()
        val senhaCorreta: Boolean = DadosLogin.senha == view?.findViewById<EditText>(R.id.camposenha)?.text.toString()

        if (emailCorreto && senhaCorreta) {
            findNavController().navigate(R.id.loginFragmentoparahomeFragmento)
        } else {
            Toast.makeText(activity, "Dados Incorretos", Toast.LENGTH_LONG).show()
        }

    }

}