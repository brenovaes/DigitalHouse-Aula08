package br.com.digitalhouse.exercicio3

fun main() {
    val estoque = Estoque("Caneta", 3, 2)
    println(estoque.mostra())

    estoque.mudarQtdMinima(-1)
    println(estoque.mostra())

    estoque.repor(7)
    println(estoque.mostra())

    estoque.mudarQtdMinima(7)
    println(estoque.mostra())

    estoque.darBaixa(15)
    println(estoque.mostra())

    println(estoque.precisaRepor())

    estoque.mudarNome("Lápis")
    println(estoque.mostra())

    estoque.mudarQtdMinima(13)
    println(estoque.mostra())

    println(estoque.precisaRepor())
}