package Faculdade_3_Semestre.Nivelamento_em_Kotlin

import kotlin.random.Random

fun main() {
    val nomesJogadores = arrayOfNulls<String>(2)
    var tentativasPlayer1 = 0
    var tentativasPlayer2 = 0
    var acertou = 0


    for (i in nomesJogadores.indices) {
        println(" Qual é o nome do jogador ${i + 1}?")
        nomesJogadores[i] = readLine()!!
    }
    println("${nomesJogadores[0]}, ${nomesJogadores[1]}")

    val numeroAleatorio = Random.nextInt(1, 100)
    do {
        println("Qual o número secreto ${nomesJogadores[0]}")
        var numeroTentado = readLine()!!.toInt()
        tentativasPlayer1++
        println("Tentei o múmero: $numeroTentado")

        if (numeroAleatorio > numeroTentado) {
            println("quase o número secreto é maior")
        } else if (numeroAleatorio == numeroTentado) {
            println("Parabéns você acertou o numero")
        } else {
            println("Quase o número secreto é menor ")
        }
    } while (acertou < 1)

    do {
        println("Qual o número secreto ${nomesJogadores[1]}")
        var numeroTentado = readLine()!!.toInt()
        tentativasPlayer2++
        println("Tentei o múmero: $numeroTentado")

        if (numeroAleatorio > numeroTentado) {
            println("quase o número secreto é maior")
        } else if (numeroAleatorio < numeroTentado) {
            println("Quase o número secreto é menor ")
        } else {
            println("Parabéns você acertou o numero")
        }
    } while (acertou == 1)

    if (tentativasPlayer1 > tentativasPlayer2) {
        println("Parabéns você ganhou ${nomesJogadores[0]} você acertou o numero em $tentativasPlayer1 tentativa(s)")
    } else if (tentativasPlayer1 == tentativasPlayer2) {
        println("O jogo deu empate")
    }else {
        println("\"Parabéns você ganhou ${nomesJogadores[1]} você acertou o numero em $tentativasPlayer2 tentativa(s)")
    }
    println("O placar foi  $tentativasPlayer1 tentativa(s) para o ${nomesJogadores[0]} \n o ${nomesJogadores[1]} levou $tentativasPlayer2 tentativa(s) para concluir ")
}