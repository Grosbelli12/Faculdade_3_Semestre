import java.util.*

fun main() {


    var numero = 0
    var ehPrimo = true

    println("Digite um número: ")
    numero = readLine()!!.toInt()

    if (numero <= 1) {
        ehPrimo = false
    } else {
        for (i in 2..numero) {
            if (numero % i == 0) {
                ehPrimo = true
            }
        }
    }
    if (ehPrimo) {
        println("$numero  é um número primo.")
    } else {
        println("$numero  não é um número primo.")
    }

}
