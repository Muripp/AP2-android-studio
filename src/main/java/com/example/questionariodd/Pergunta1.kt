package com.example.questionariodd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta1 : AppCompatActivity() {
    override fun onCreate(ultimaInstancia: Bundle?) {
        super.onCreate(ultimaInstancia)
        setContentView(R.layout.layout_pergunta)


        val fragment = Fragmento()
        fragment.setupFragment(
            "Qual o estilo de jogo do seu personagem?",
            R.drawable.fantasy_magic_weapons_drawing
        )

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

        val resposta1 = findViewById<Button>(R.id.resposta1)
        resposta1.text = "Guerreiro"
        val resposta2 = findViewById<Button>(R.id.resposta2)
        resposta2.text = "Mago"
        val resposta3 = findViewById<Button>(R.id.resposta3)
        resposta3.text = "Arqueiro"
        val resposta4 = findViewById<Button>(R.id.resposta4)
        resposta4.text = "Curandeiro"



        resposta1.setOnClickListener {
            Pontos.somar(3, "fighter")
            Pontos.somar(3, "paladino")
            Pontos.somar(3, "barbaro")
            Pontos.somar(3, "monge")
            Pontos.somar(2, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta2::class.java)
            startActivity(intent)

        }

        resposta2.setOnClickListener {

            Pontos.somar(2, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(2, "rogue")
            Pontos.somar(5, "mago")
            Pontos.somar(3, "clerigo")
            Pontos.somar(3, "bardo")
            Pontos.somar(1, "ranger")
            Pontos.somar(3, "druida")
            val intent = Intent(this, Pergunta2::class.java)
            startActivity(intent)

        }

        resposta3.setOnClickListener {
            Pontos.somar(3, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(3, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(5, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta2::class.java)
            startActivity(intent)
        }

        resposta4.setOnClickListener {
            Pontos.somar(0, "fighter")
            Pontos.somar(3, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(1, "monge")
            Pontos.somar(0, "rogue")
            Pontos.somar(1, "mago")
            Pontos.somar(5, "clerigo")
            Pontos.somar(3, "bardo")
            Pontos.somar(1, "ranger")
            Pontos.somar(3, "druida")
            val intent = Intent(this, Pergunta2::class.java)
            startActivity(intent)
        }
    }
}