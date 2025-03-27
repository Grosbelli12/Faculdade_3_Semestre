package Faculdade_3_Semestre.Aulas.Aula02.Teste

import Faculdade_3_Semestre.Aulas.Aula02.Dominio.Convidado

val expressaoRegular = Regex("[0-5]")


// Instância de um lista de mutável vazia
var listaConvidados: MutableList<Convidado> = mutableListOf<Convidado>()

fun main() {
    menu()
}

private fun menu() {
    do {
        println("---MENU---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("5- BUSCA")
        println("0- SAIR")

        val opcao = readln()

        if (expressaoRegular.matches(opcao)) {
            when (opcao.toInt()) {
                1 -> {
                    print("Cadastrando...")
                    cadastrar()
                }

                2 -> {
                    print("listando...")
                    listar()

                }

                3 -> {
                    print("Editando...")
                    editar()

                }

                4 -> {
                    print("Excluindo...")
                    excluir()
                }

                5 -> {
                    println("Buscando...")
                    busca()
                }

                0 -> print("Saindo...")
            }
        } else {
            println(
                "\n" +
                        "\n" +
                        "\n" +
                        "Opção inválida!"
            )
        }
    } while (opcao.toInt() != 0)
}

private fun cadastrar() {
    val convidado: Convidado = Convidado()
    print("Qual é o seu nome? ")
    //val nome = readln()
    convidado.nome = readln()

    print("Qual vai ser o seu presente? ")
    //val presente = readln()
    convidado.presente = readln()

    print("Qual sua resitrição alimentar? ")
    //val alimento = readln()
    convidado.alimentar = readln()

    listaConvidados.add(convidado)
}

private fun listar(): String {
    var i = 0
    if (validar()) {
        listaConvidados.forEach { convidado ->
            print(
                "Posição ${i++} " +
                        "Nome: ${convidado.nome};\n " +
                        " Presente: ${convidado.presente};\n " +
                        " Restrição:${convidado.alimentar};\n " +
                        " Vai ir a festa? ${convidado.presenca}\n; "
            ) //FIM DO PRINT
        } // FIM DO FOR EACH
    }// FIM DO IF
    return "Listagem foi um sucesso "// retorna a função
} // FIM DA FUNÇÃO LISTAR

private fun editar(): Boolean {
    if (validar()) {
        listar()

        println("Digite a posição a ser editada:")
        val posicao = readln().toInt()

        println("O convidado vai? S/N")
        val resposta = readln().uppercase().trim()

        when (resposta) {
            "S" -> listaConvidados[posicao].presenca = true
            "N" -> listaConvidados[posicao].presenca = false
        }
    }


    return true
}

private fun excluir(): Boolean {
    if (validar()) {
        println("Qual posição você deseja remover:")
        val posicao = readln().toInt()
        listaConvidados.removeAt(posicao)

        /* convidado.nome = ""
         convidado.alimentar = ""
         convidado.presente = ""
         convidado.presenca = false
         println("Convidar excluido ")*/

        listar()
        println("Candidato removido")
    }
    return true
}

private fun busca() {
    var i = 0 // indece da lista
    println("Digite o nome da pessoa que você busca: ")
    val busca = readln()
    listaConvidados.forEach { convidado ->
        //o contains busca por uma string dentro de uma outra string
        if (convidado.nome.contains(busca)) {
            println("Posição: $i, Nome: ${convidado.nome} Presente: ${convidado.presente} Restrição: ${convidado.alimentar} Presença: ${convidado.presenca}")
        }
        i++
    }
}

private fun validar(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("Lista vazia! Finalizando ")
        return false
    } else {
        return true
    }

}