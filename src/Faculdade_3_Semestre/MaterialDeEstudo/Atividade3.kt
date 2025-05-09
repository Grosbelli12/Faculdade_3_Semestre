package Faculdade_3_Semestre.MaterialDeEstudo

import kotlin.random.Random

val expressaoRegular = Regex("[0-4]")

fun main() {
    menu()

}

private fun menu() {

    do {
        println("-----Menu-----")
        println("1- Somar vários números reais")
        println("2- Gerar um número aleatório")
        println("3- Leitura do teclado de números inteiros positivos e negativos")
        println("4- Sair")

        val opcao = readln()

        if (expressaoRegular.matches(opcao))
            when (opcao.toInt()) {
                1 -> {
                    soma()
                }

                2 -> {
                    gerarNumero()
                }

                3 -> {
                    leitorTeclado()
                }

                4 ->
                    println("Saindooo")
            }

    } while (opcao.toInt() != 4)
}

private fun soma() {
    println("Digite quantos números reais você deseja somar: ")
    var qntnumeros = readln().toInt()

    var soma = 0.0

    for (i in 1..qntnumeros) {
        println("Digite o $i° número")
        val numero = readln().toDouble()
        soma += numero
    }
    println(soma)
}

private fun gerarNumero() {

    println("Digete o 1° número do intervalo")
    val num1 = readln().toInt()

    println("Direte o 2° número do intervalo")
    val num2 = readln().toInt()

    val numAleatorio = Random.nextInt(num1, num2)
    println("O número aleatório é: $numAleatorio")
}

private fun leitorTeclado() {

    val numPositivos = mutableListOf<Int>()
    val numNegativios = mutableListOf<Int>()
    var i = 0
    while (i < 10) {
        println("Digite o ${i + 1}º número inteiro positivo:")
        val num = readln().toInt()
        if (num > 0) {
            numPositivos.add(num)
            i++
        } else {
            println("Por favor, digite um número positivo.")
        }
    }

    i = 0
    while (i < 10) {
        println("Digite o ${i + 1}º número inteiro negativo:")
        val num = readln().toInt()
        if (num < 0) {
            numNegativios.add(num)
            i++
        } else {
            println("Por favor, digite um número negativo.")
        }
    }

    for (numero in numPositivos.sorted()) {
        println(" Números Positivos : $numero")
    }
    for (numero in numNegativios.sorted()) {
        println("Números Negativos: $numero")
    }

}
