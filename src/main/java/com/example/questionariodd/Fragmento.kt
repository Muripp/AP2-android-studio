package com.example.questionariodd
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
class Fragmento : Fragment() {
    private var pergunta: String? = "Questionario de d&d."
    private var imagem: Int? = R.drawable.dnd_symbol

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view = inflater.inflate(R.layout.fragment_pergunta1, container, false)
        val textView: TextView = view.findViewById(R.id.pergunta)
        val imageView: ImageView = view.findViewById(R.id.imageView)

        textView.text = pergunta
        imageView.setImageResource(imagem ?: 0)//botamos o ?: 0 pra caso a img seja nula o app n crashe

        return view
    }

    fun setupFragment(pergunta: String, imagem: Int) {
        //Esse método serve para updatar a pergunta
        this.pergunta = pergunta
        this.imagem = imagem
    }
}