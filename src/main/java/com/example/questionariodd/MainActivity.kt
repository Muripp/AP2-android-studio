package com.example.questionariodd
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(ultimaInstancia: Bundle?) {
        super.onCreate(ultimaInstancia)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .add(R.id.fragment_container, Fragmento())
            .commit()

        val botao = findViewById<Button>(R.id.iniciarButton)

        botao.setOnClickListener {
            val intent = Intent(this, Pergunta1::class.java)
            startActivity(intent)
        }
    }
}
