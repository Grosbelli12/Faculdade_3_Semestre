import java.lang.classfile.instruction.SwitchCase
import java.util.Scanner

fun main() {
    var soma = 0.0
    var qtdNotas = 3
    val scanner = Scanner(System.`in`)
    var media = 0.0


    for (i in 1..qtdNotas) {
        println("Digite a nota " + i + ":")
        soma +=  readLine()!!.toDouble()
    }

    media = soma / qtdNotas
    println("MEDIA = " + media)

    if (media > 7) {
        println("Aprovado")
    }else if (media < 5) {
        println("RECUPERAÇÃO")
    }else{
        println("Reprovado")
    }


}