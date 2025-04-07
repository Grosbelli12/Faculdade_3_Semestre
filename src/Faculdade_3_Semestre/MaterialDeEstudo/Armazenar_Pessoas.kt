package Faculdade_3_Semestre.MaterialDeEstudo

fun main() {
    val expressãoRegular = Regex("^[a-zA-Z]+$")
    val expressãoRegular2 = Regex("[1-2]")

    var listaConvidados: MutableList<String> = mutableListOf<String>()
    var pessoa = " "
    do {
        do {
            println("Digite o nome da pessoa que deseja adicionar a lista: ")
            pessoa = readln().uppercase()
            if (!expressãoRegular.matches(pessoa)) {
                println("Digite caracteres validos")
            }
        } while (!expressãoRegular.matches(pessoa))

        listaConvidados.add(pessoa)

        println("Deseja adicionar mais pessoas a lista? se sim Digite 1  se não digite 2: ")
        var aux = readln()
        listaConvidados.sort()
        if (!expressãoRegular2.matches(aux)) {
            println("Digite um número correto")
        }
    } while (aux.toInt() != 2)
    for (nome in listaConvidados) {
        println("Nome: $nome")
    }
}