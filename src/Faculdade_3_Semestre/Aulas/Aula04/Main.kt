package Faculdade_3_Semestre.Aulas.Aula04

import java.util.LinkedList


fun main(){
    val pilha = LinkedList<String>()

    //Prateleira de produtos
    pilha.push("Sardinha")
    pilha.push("Milho")
    pilha.push("Molho de Tomate")

    // Acessar primeiro elemento da Pilha
    println(pilha.peek())

    //Ver tamanho da Pilha
    println(pilha.size)

    //Remover um elemento da prateleira (Pilha)
    val esgotado = pilha.pop()
    println("Esgotados: $esgotado")
    println("Novo produto no topo da pilha: ${pilha.peek()}")

    //Verifica se existem produtos na prateleira (Pilha)
    if (pilha.isEmpty()){
        println("Acabou os produtos!")
    }else{
        println("Ainda existe produtos!")
    }
    //Verifica tudo o que tem na prateleira (Pilha)
    println(pilha)

    //Criação de uma FILA
    val fila = LinkedList<String>()

    //Adicionar usuarios a Fila
    fila.addLast("Joãozinho")
    fila.addLast("Mariazinha")
    fila.addLast("Pedrinho")

    // vejo o primeiro usuário da Fila
    println(fila.peek())

    //Ver todos os úsuarios da Fila
    println(fila)

    do {
        println(" O user: ${fila.removeFirst()} entrou no servidor ") //Faz duas coisas ao mesmo tempo, imprime ele e remove ele
        Thread.sleep(5000)//Faz o processador parar por 5 segundos

    }while (fila.isNotEmpty()) //Enquanto tiver gente na fila, repita

    //-----------------------------------

    val bulbasaur = mapOf(
        "GRAMA" to listOf("ÁGUA, TERRA, PEDRA"),
        "VENENO" to listOf("FADA, PLANTA")
    )
    val ivisaur = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val venousauro = mapOf(
        "GRAMA" to listOf("ÁGUA", "TERRA", "PEDRA"),
        "VENENO" to listOf("FADA", "PLANTA")
    )
    val charmander = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val charmeleon = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
    )
    val charizard = mapOf(
        "FOGO" to listOf("PLANTA", "GELO", "INSETO", "AÇO")
        "VOADOR" to listOf("INSETO", "GRAMA", "LUTADOR")
    )
    val squirtle = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val warturtle = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val blastoise = mapOf(
        "AGUA" to listOf("FOGO", "TERRA", "PEDRA")
    )
    val caterpie = mapOf(
        "INSETO" to listOf("PLANTA", "PSÍQUICO")
    )
    val metapo = mapOf(
        "INSETO" to listOf(
            "INSETO" to listOf("PLANTA", "PSÍQUICO")
        )

    )
}
