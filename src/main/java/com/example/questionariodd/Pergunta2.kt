package com.example.questionariodd

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Pergunta2 : AppCompatActivity() {
    override fun onCreate(ultimaInstancia: Bundle?) {
        super.onCreate(ultimaInstancia)
        setContentView(R.layout.layout_pergunta2)




        val fragment = Fragmento()
        fragment.setupFragment(
            "Você gosta de usar magia ou não?",
            R.drawable.spellbook
        )

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, fragment)
            .commit()

        val resposta1 = findViewById<Button>(R.id.resposta1)
        resposta1.text = "Sim"
        val resposta2 = findViewById<Button>(R.id.resposta2)
        resposta2.text = "Não"


        resposta1.setOnClickListener {
            Pontos.somar(1, "fighter")
            Pontos.somar(2, "paladino")
            Pontos.somar(0, "barbaro")
            Pontos.somar(0, "monge")
            Pontos.somar(1, "rogue")
            Pontos.somar(2, "mago")
            Pontos.somar(2, "clerigo")
            Pontos.somar(2, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(2, "druida")
            val intent = Intent(this, Pergunta21::class.java)
            startActivity(intent)

        }

        resposta2.setOnClickListener {

            Pontos.somar(4, "fighter")
            Pontos.somar(0, "paldino")
            Pontos.somar(4, "barbaro")
            Pontos.somar(4, "monge")
            Pontos.somar(4, "rogue")
            Pontos.somar(0, "mago")
            Pontos.somar(0, "clerigo")
            Pontos.somar(0, "bardo")
            Pontos.somar(0, "ranger")
            Pontos.somar(0, "druida")
            val intent = Intent(this, Pergunta3::class.java)
            startActivity(intent)

        }

    }
}