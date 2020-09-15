package br.com.digitalhouse.exercicio3

class Estoque (var nome: String, var qtdAtual: Int, var qtdMinima: Int){

    init {
        when {
            qtdAtual < 0 -> {
                qtdAtual = 0
            }
        }
        when {
            qtdMinima < 0 -> {
                qtdMinima = 0
            }
        }
    }

    fun mudarNome(nome: String){
        this.nome = nome
    }
    fun mudarQtdMinima(qtdMinima: Int){
        if (qtdMinima > 0) {
            this.qtdMinima = qtdMinima
        }
    }
    fun repor(qtd: Int){
        qtdAtual += qtd
    }
    fun darBaixa (qtd: Int){
        if (qtdMinima - qtd >= 0 && qtdAtual - qtd >= qtdMinima ) {
            qtdAtual -= qtd
        }
    }
    fun mostra(): String{
        return "Nome: $nome | Quantidade mínima: $qtdMinima | Quantidade atual: $qtdAtual"
    }
    fun precisaRepor(): Boolean{
        return qtdAtual <= qtdMinima
    }
}