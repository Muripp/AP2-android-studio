package com.example.questionariodd

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton

import androidx.appcompat.app.AppCompatActivity

class Pergunta21 : AppCompatActivity() {
    override fun onCreate(ultimaInstancia: Bundle?) {

        super.onCreate(ultimaInstancia)
        setContentView(R.layout.layout_pergunta21)



        val resposta1 = findViewById<ImageButton>(R.id.b1)
        val resposta2 = findViewById<ImageButton>(R.id.b2)
        val resposta3 = findViewById<ImageButton>(R.id.b3)
        val resposta4 = findViewById<ImageButton>(R.id.b4)



        resposta1.setOnClickListener {
            Pontos.somar(2, "fighter")
            Pontos.somar(0, "paladino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(2, "rogue")
            Pontos.somar(4, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta3::class.java)
            startActivity(intent)

        }

        resposta2.setOnClickListener {

            Pontos.somar(0, "fighter")
            Pontos.somar(3, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(1, "monge")
            Pontos.somar(0, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(4, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta3::class.java)
            startActivity(intent)

        }

        resposta3.setOnClickListener {
            Pontos.somar(0, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(0, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(5, "ranger")
            Pontos.somar(7, "druida")
            val intent = Intent(this, Pergunta3::class.java)
            startActivity(intent)
        }

        resposta4.setOnClickListener {
            Pontos.somar(0, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(0, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(99, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta3::class.java)
            startActivity(intent)
        }
    }
}