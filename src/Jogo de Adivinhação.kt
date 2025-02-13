import kotlin.random.Random

fun main() {

    var tentativa = 0
    var tentativas = 0

    val numeroSecreto = Random.nextInt(1, 101)
    println("Tente adivinhar o número entre 1 e 100!")

    while (true) {
        println("Digite seu palpite:")
        tentativa = readLine()!!.toInt()
        tentativas++
        if (tentativa == numeroSecreto) {
            println("Parabéns! Você acertou em " + tentativas + " tentativas.")
        } else if (tentativas < numeroSecreto) {
            println("Tente um número maior.")
        } else {
            println("Tente um número menor.")
        }
    }
}