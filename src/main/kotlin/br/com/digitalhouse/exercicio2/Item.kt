package br.com.digitalhouse.exercicio2

class Item(val numItem: Int, val descricaoItem: String, var qtdItem: Int, var precoUniItem: Float) {
    init {
        when {
            qtdItem < 0 -> {
                qtdItem = 0
            }
            precoUniItem < 0 -> {
                precoUniItem = 0.0F
            }
        }
    }
}