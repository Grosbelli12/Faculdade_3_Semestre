import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val random = Random()
    var numeroSecreto = 0
    var tentativa = 0
    var tentativas = 0

    numeroSecreto = random.nextInt(100) + 1
    println("Tente adivinhar o número entre 1 e 100!")

    while (true) {
        println("Digite seu palpite:")
        tentativa = scanner.nextInt()
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