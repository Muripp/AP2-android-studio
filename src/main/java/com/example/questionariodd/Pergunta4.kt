package com.example.questionariodd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta4 : AppCompatActivity() {
    override fun onCreate(ultimaInstancia: Bundle?) {
        super.onCreate(ultimaInstancia)
        setContentView(R.layout.layout_pergunta)


        val fragment = Fragmento()
        fragment.setupFragment(
            "O que seu personagem mais valoriza?",
            R.drawable.ceara
        )

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

        val resposta1 = findViewById<Button>(R.id.resposta1)
        resposta1.text = "Força e Resistencia"
        val resposta2 = findViewById<Button>(R.id.resposta2)
        resposta2.text = "Mobilidade e agilidade"
        val resposta3 = findViewById<Button>(R.id.resposta3)
        resposta3.text = "Inteligência"
        val resposta4 = findViewById<Button>(R.id.resposta4)
        resposta4.text = "Sabedoria"



        resposta1.setOnClickListener {
            Pontos.somar(3, "fighter")
            Pontos.somar(4, "paladino")
            Pontos.somar(4, "barbaro")
            Pontos.somar(1, "monge")
            Pontos.somar(0, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(2, "druida")
            val intent = Intent(this, Resultados::class.java)
            startActivity(intent)

        }

        resposta2.setOnClickListener {

            Pontos.somar(2, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(1, "barbaro")
            Pontos.somar(5, "monge")
            Pontos.somar(5, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(4, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Resultados::class.java)
            startActivity(intent)

        }

        resposta3.setOnClickListener {
            Pontos.somar(3, "fighter")
            Pontos.somar(1, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(1, "monge")
            Pontos.somar(3, "rogue")
            Pontos.somar(5, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(3, "bardo")
            Pontos.somar(2, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Resultados::class.java)
            startActivity(intent)
        }

        resposta4.setOnClickListener {
            Pontos.somar(1, "fighter")
            Pontos.somar(2, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(3, "monge")
            Pontos.somar(2, "rogue")
            Pontos.somar(2, "mago")
            Pontos.somar(5, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(3, "ranger")
            Pontos.somar(5, "druida")
            val intent = Intent(this, Resultados::class.java)
            startActivity(intent)
        }
    }
}