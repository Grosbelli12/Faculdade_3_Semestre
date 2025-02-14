package Faculdade_3_Semestre.Ex_Aula_01_Kotlin

fun main() {
    var soma = 0.0
    var qtdNotas = 3
    var media = 0.0


    // readLine = lê a entrada do usuario
    // ?. =  verifica se a entrado foi null se não for o código será executado se for null  irá retornar null
    // toDoubleOrNull() = converte a string para double nesse caso, se não conseguir retorna null
    // ?: caso seja um valor null o valor depois dele será usado nesse caso é o o.o
    // i = contador
    // in = indica o valorr que i terá
    // 1.. =  é o intervalo de 1 até qntNotas
    // .. = operador de range(intervalo)
    // para fazer o contador decrescente trocar o .. por downTo

    for (i in 1..qtdNotas) {
        println("Digite a nota " + i + ":")
        soma += readLine()?.toDoubleOrNull() ?: 0.0
    }

    media = soma / qtdNotas
    println("MEDIA = " + media)

    if (media > 7) {
        println("Aprovado")
    } else if (media < 5) {
        println("RECUPERAÇÃO")
    } else {
        println("Reprovado")
    }


}