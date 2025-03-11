package Faculdade_3_Semestre.Ex_Aulas

fun main() {

    println("Digite um número para calcular o fatorial: ")
    val numero = readLine()?.toIntOrNull() ?: 0
    var fatorial = 1

    for (i in numero downTo 1) {
        fatorial *= i
        println("O $fatorial de numero é $fatorial")
    }
}