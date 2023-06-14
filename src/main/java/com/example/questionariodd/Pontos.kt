package com.example.questionariodd

object Pontos {

    val pontuacao = mutableMapOf("paladino" to 0,
        "mago" to 0,
        "fighter" to 0,
        "barbaro" to 0,
        "druida" to 0,
        "bardo" to 0,
        "monge" to 0,
        "clerigo" to 0,
        "ranger" to 0,
        "rogue" to 0)
    fun somar(quant : Int, key: String) {
        pontuacao[key] = (pontuacao[key] ?: 0) + quant
    }
}