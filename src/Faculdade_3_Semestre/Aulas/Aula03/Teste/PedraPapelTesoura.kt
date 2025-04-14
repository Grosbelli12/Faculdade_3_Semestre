package Faculdade_3_Semestre.Aulas.Aula03.Teste

import Faculdade_3_Semestre.Aulas.Aula03.Dominio.Papel
import Faculdade_3_Semestre.Aulas.Aula03.Dominio.Pedra
import Faculdade_3_Semestre.Aulas.Aula03.Dominio.Tesoura

// VARIAVEL GLOBAL

var pontos = 0
fun main() {
    println("Hello word")

    do {
        println("1-JOGAR")
        println("2-PLACAR")
        println("3-SAIR")

        val opcao = readln() // USUARIO DIGITA A OPÇÃO

        when (opcao.toInt()) {
            1 -> jogar()
            2 -> println("placar")
            3 -> println("saindo...")
        }
    } while (opcao != "0")

}

fun jogar() {
    println("Digite seu nickname: ")
    val nickname = readLine() // O USUARIO DIGITA SEU NICK

    println("QUES OS JOGOS COMECEM")
    var rodadas = 1

    do {
        println("O que você quer jogar? ")
        println("Pedra, papel ou tesoura ")
        var jogada = readln().uppercase()// Movimento do jogador

        //instâncias do jogo
        var pedra = Pedra()
        var tesoura = Tesoura()
        var papel = Papel()

        var movimentoPC = pcjogada()// Movimento do PC
        println("O computador jogou ${pcjogada()}")
        when (jogada) {
            "PEDRA" -> {
                pontos = pedra.luta(movimentoPC)
            }
            "PAPEL" -> {
                pontos = papel.luta(movimentoPC)
            }
            "TESOURA" -> {
                pontos = tesoura.luta(movimentoPC)
            }
        }
        println("Você tem: $pontos pontos")
        println("Próxima rodada!")

        rodadas++ // NO FINAL DA RODADA INCREMENTA
    } while (rodadas <= 3)

}

fun pcjogada(): String {
    val movimento = (1..3).random()
    when (movimento) {
        1 -> return "TESOURA"
        2 -> return "PEDRA"
        3 -> return "PAPEL"
        else -> return ""
    }
}

fun placar() {

}
