package Faculdade_3_Semestre.MaterialDeEstudo



fun main() {
    val expressãoRegular = Regex("^[a-zA-Z]+$")
    var listaConvidados: MutableList<String> = mutableListOf<String>()
    var pessoa = " "
    do {
        do {
            println("Digite o nome da pessoa que deseja adicionar a lista: ")
            pessoa = readln()
            if (!expressãoRegular.matches(pessoa)) {
                println("Digite caracteres validos")
            }
        } while (!expressãoRegular.matches(pessoa))

        listaConvidados.add(pessoa)

        println("Deseja adicionar mais pessoas a lista? se sim Digite 1  se não digite 2: ")
        val aux = readln().toInt()
        listaConvidados.sort()
    } while (aux != 2)
    for (nome in listaConvidados) {
        println("Nome: $nome")
    }

}