package br.com.digitalhouse.exercicio1

class Fatura(val listaItens: List<Item>) {

    var totalFatura: Float = 0F

    fun getTotalFatura(){
        println("------------ Descrição da fatura: ------------")
        for(item in listaItens){
            when {
                item.qtdItem == 0 -> {
                    break
                }
                item.precoUniItem == 0.0F -> {
                    break
                }
            }
            val valor = item.qtdItem * item.precoUniItem
            totalFatura += valor
            println("${item.qtdItem} ${item.descricaoItem}, código ${item.numItem}, valor unitário de R$ ${item.precoUniItem}, somando R$$valor")
        }
        println("---------------- Valor total: ----------------")
        println("R$ $totalFatura")
    }
}