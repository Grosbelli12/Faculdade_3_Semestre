package Faculdade_3_Semestre.Ex_Aula_01_Kotlin

fun main() {


    var numero = 0
    var ehPrimo = true

    println("Digite um número: ")
    numero = readLine()?.toIntOrNull() ?: 0

    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (i in 2..numero) {
            if (numero % i == 0) {
                ehPrimo = false
                break
            }
        }
    }
    if (ehPrimo) {
        println("$numero  é um número primo.")
    } else {
        println("$numero  não é um número primo.")
    }

}
