package br.com.digitalhouse.exercicio1

fun main() {
    var item1 = Item(1, "Notebook", 1, 2500.0F)
    var item2 = Item(3, "Celular", 10, 2900.0F)
    var item3 = Item(2, "Tablet", -1, 1200.0F)
    var item4 = Item(4, "Smartwatch", 5, -1600.0F)

    var listItems = listOf<Item>(item1, item2, item3, item4)

    val fatura = Fatura(listItems)
    fatura.getTotalFatura()
}