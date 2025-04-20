package Faculdade_3_Semestre.Atividades
import Faculdade_3_Semestre.Atividades.Produtos

import java.util.*

fun main (){
    var pilha = LinkedList<Produtos>()

    val produtos: Produtos = Produtos()
    produtos.nome = "leite"
    produtos.validade = "2 MESES"
    produtos.quantidade = 4

    pilha.add(produtos)

    println(pilha)
}