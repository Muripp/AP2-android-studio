package com.example.questionariodd

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Resultados : AppCompatActivity() {
    override fun onCreate(ultimaInstancia: Bundle?) {
        super.onCreate(ultimaInstancia)
        setContentView(R.layout.resultados)


        //primeiro vamos descobrir qual é o maior
        var maior = "fighter"
        var maiorValor = 0
        Pontos.pontuacao.forEach { classe, valor ->
            if (valor > maiorValor){
                maior = classe
                maiorValor = valor
            }
        }


        val urls = mapOf("fighter" to "http://dnd5e.wikidot.com/fighter",
            "barbaro" to "http://dnd5e.wikidot.com/barbarian",
            "bardo" to "http://dnd5e.wikidot.com/bard",
            "clerigo" to "http://dnd5e.wikidot.com/cleric",
            "druida" to "http://dnd5e.wikidot.com/druid",
            "monge" to "http://dnd5e.wikidot.com/monk",
            "paladino" to "http://dnd5e.wikidot.com/paladin",
            "ranger" to "http://dnd5e.wikidot.com/ranger",
            "rogue" to "http://dnd5e.wikidot.com/rogue",
            "mago" to "http://dnd5e.wikidot.com/wizard",)

        val imgs = mapOf("fighter" to R.drawable.figther,
            "barbaro" to R.drawable.barbaro,
            "bardo" to R.drawable.bardo,
            "clerigo" to R.drawable.clerigo,
            "druida" to R.drawable.druida,
            "monge" to R.drawable.monk,
            "paladino" to R.drawable.paladino,
            "ranger" to R.drawable.ranger,
            "rogue" to R.drawable.rogue,
            "mago" to R.drawable.mago)

        val descricoes = mapOf("fighter" to "Guerreiros são mestres do combate, conhecidos" +
                " por sua perícia com uma variedade de armas e armaduras. Eles têm um grande" +
                " número de pontos de vida, são excelentes no combate corpo a corpo ou à distância" +
                " e possuem habilidades que permitem ataques múltiplos, defesas sólidas" +
                " e resistência excepcional. Dependendo do arquétipo escolhido, um guerreiro" +
                " pode ser desde um nobre cavaleiro até um guerreiro que" +
                " usa magia junto com sua arma.",
            "barbaro" to "Bárbaros são guerreiros selvagens conhecidos por sua incrível força" +
                    " bruta e capacidade de resistir a danos que derrubariam outros. Eles canalizam" +
                    " sua fúria interior em combate, o que lhes dá vantagens em batalhas.\n",
            "bardo" to "Bardo é uma classe versátil, famosa por suas habilidades mágicas que são" +
                    " impulsionadas pela música e pelo desempenho artístico. Eles podem" +
                    " encantar pessoas, contar histórias hipnotizantes e até mesmo lançar" +
                    " feitiços para ajudar seus companheiros de equipe ou confundir seus inimigos.",
            "clerigo" to "lérigos são guerreiros sagrados e mágicos que obtêm seus poderes de" +
                    " divindades que servem. Eles são conhecidos por suas habilidades de cura" +
                    " e proteção, além de poderem lançar feitiços ofensivos contra seus" +
                    " inimigos.",
            "druida" to "Druidas são mestres da natureza, capazes de assumir a forma de animais," +
                    " curar feridos e até mesmo controlar os elementos. Eles canalizam a energia" +
                    " da natureza para lançar seus feitiços e são particularmente eficazes" +
                    " em ambientes naturais.",
            "monge" to "Monges são mestres das artes marciais, usando seu conhecimento do ki," +
                    " ou energia vital, para realizar proezas sobrenaturais. Eles são notavelmente" +
                    " ágeis e podem desviar de ataques, mover-se rapidamente e atacar com uma" +
                    " barragem de golpes.",
            "paladino" to "Paladinos são guerreiros sagrados que fazem juramentos divinos" +
                    " para defender o bem e a ordem. Eles têm a capacidade de curar, proteger" +
                    " seus aliados e causar danos significativos com suas armas encantadas.",
            "ranger" to "Rangers são caçadores e rastreadores, mestres em sobrevivência na" +
                    " natureza. Eles são excelentes com armas à distância, como arcos, e têm" +
                    " a capacidade de conjurar feitiços que os auxiliam em combate e exploração.",
            "rogue" to "Rogues são mestres em furtividade e truques. Eles são conhecidos por sua" +
                    " capacidade de desferir golpes críticos em inimigos desavisados, desarmar " +
                    "armadilhas, abrir fechaduras e serem excelentes em tarefas que requerem " +
                    "furtividade e astúcia.",
            "mago" to "Magos são conjuradores de magia arcanas, conhecidos por uma vasta gama" +
                    " de feitiços tanto ofensivos quanto defensivos. Eles são frágeis em combate" +
                    " corpo a corpo, mas compensam isso com sua capacidade de causar grandes" +
                    " quantidades de danos ou criar efeitos úteis com seus feitiços.",)

        //deixando bonito com letra maiuscula
        val classe = maior[0].uppercaseChar() + maior.substring(1)


        if (findViewById<View>(R.id.fragment_container) != null) {
            //updatando o fragmento
            val fragment = Fragmento()
            imgs[maior]?.let {
                fragment.setupFragment(
                    "A melhor classe para você é:\n $classe",
                    it
                )
            }

            supportFragmentManager.beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit()
        }

        val botao = findViewById<Button>(R.id.iniciarButton)
        val desc = findViewById<TextView>(R.id.descricao)
        val nota = findViewById<RatingBar>(R.id.nota)
        desc.text =  descricoes[maior]

        val enviar = findViewById<Button>(R.id.enviar)
        enviar.setOnClickListener {
            val enviar = findViewById<Button>(R.id.enviar)
            enviar.setOnClickListener {
                val intent = Intent(Intent.ACTION_SEND).apply {
                    type = "message/rfc822"
                    putExtra(Intent.EXTRA_EMAIL, arrayOf("muripp@gmail.com"))
                    putExtra(Intent.EXTRA_SUBJECT, "Review do questionario")
                    putExtra(Intent.EXTRA_TEXT, "nota: " + nota.rating)
                }
                if (intent.resolveActivity(packageManager) != null) {
                    startActivity(intent)
                }
            }
        }



        botao.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(urls[maior])
            startActivity(intent)
        }

    }
}