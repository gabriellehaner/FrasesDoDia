package com.example.frasesdodia

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import kotlin.random.Random


class HomeFragmento : Fragment(R.layout.home_fragmento) {

    val frases = arrayOf(
        "Que o dia comece bem e termine ainda melhor.",
        "Pra hoje: sorrisos bobos, uma mente tranquila e um coração cheio de paz.",
        "Às vezes as coisas demoram, mas acontecem. O importante é saber esperar e não perder a fé!",
        "Imagine uma nova história para a sua vida e acredite nela.",
        "Nem todos os dias são bons, mas há algo bom em cada dia.",
        "Sorria! Deus acaba de te dar um novo dia e coisas extraordinárias podem acontecer se você acreditar.",
        "Levanta, sacode a poeira e dá a volta por cima.",
        "Um pequeno pensamento positivo pela manhã pode mudar todo o seu dia.",
        "Que os dias ruins se tornem raros e os bons virem rotina.",
        "Todo dia é uma ocasião especial. Guarde apenas o que tem que ser guardado: lembranças, sorrisos, poemas, cheiros, saudades, momentos…",
        "Cultive o amor, tristeza não dá flor.",
        "Não se preocupe em entender, viver ultrapassa qualquer entendimento.",
        "Seja a mudança que você deseja ver no mundo.",
        "Só existem dois dias no ano em que nada pode ser feito. Um se chama ontem e o outro se chama amanhã, portanto hoje é o dia certo para amar, acreditar, fazer e principalmente viver.",
        "A mudança que você quer está na decisão que você toma.",
        "Viva sua vida com quem te deixa feliz e não com quem você tenha que agradar."
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.botaofrase).setOnClickListener {
            gerarFrase(view)
        }


        view.findViewById<Button>(R.id.sairbotaohome).setOnClickListener {
            findNavController().navigate(R.id.homeFragmentoparainicioFragmento)
        }
    }

    fun gerarFrase (view: View){
        val totalItensArray = frases.size
        val numeroAleatorio = Random.nextInt(totalItensArray)

        var text = view.findViewById<TextView>(R.id.campodafrase)
        text.setText(frases[numeroAleatorio])
//        val botao = view.findViewById<Button>(R.id.botaofrase)
    }


}