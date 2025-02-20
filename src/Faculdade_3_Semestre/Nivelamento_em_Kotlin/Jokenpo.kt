package Faculdade_3_Semestre.Nivelamento_em_Kotlin

fun main() {


    var resposta = 0
    var contadorvit = 0
    var contadorder = 0
    var contadorempate = 0
    val escolhaAleatoria = listOf(1, 2, 3)

    // tarnsforma a resposta que inteira para uma String
    fun escolhaParaString(escolha: Int): String {
        return when (escolha) {
            1 -> "pedra"
            2 -> "tesoura"
            3 -> "papel"
            else -> "inválido"
        }
    }
    do {
        println("Digite 1 para tesoura 2 para pedra e 3 para papel")
        resposta = readLine()!!.toInt()
        val resposta2 = escolhaAleatoria.random()

        // depois ter lido a resposta ele troca pela String correspondente a sua resposta que foi definida acima
        val escolhaUsuario = escolhaParaString(resposta)
        val escolhaComputador = escolhaParaString(resposta2)

        if (resposta2 == resposta) {
            println("Empate tente novamente! deu $escolhaUsuario $escolhaComputador")
            contadorempate++
        } else if (resposta2 > resposta) {
            println("Você perdeu! tente novamente deu $escolhaUsuario $escolhaComputador!")
            contadorder++
        } else {
            println("você ganhou! parabéns deu $escolhaUsuario $escolhaComputador")
            contadorvit++
        }
        println("Placar do jogo $contadorvit vitórias e  $contadorder derrotas e $contadorempate empates")
        println("você deseja continuar jogando se sim digite 1 se não digite 2")
         val verificador = readLine()!!.toInt()
    } while (verificador == 1)
}