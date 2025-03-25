package Faculdade_3_Semestre.Aulas.Aula02.Teste

import Faculdade_3_Semestre.Aulas.Aula02.Dominio.Convidado

val expressaoRegular = Regex("[0-4]")

// var Global
var convidado: Convidado = Convidado()

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
    if (listaConvidados.isEmpty()) {
        println("Não há convidados")

    } else {
        listaConvidados.forEach { convidado ->
            print(
                "Posição ${i++} " +
                        "Nome: ${convidado.nome};\n " +
                        " Presente: ${convidado.presente};\n " +
                        " Restrição:${convidado.alimentar};\n " +
                        " Vai ir a festa? ${convidado.presenca}\n; "
            )
        }
    }
    return "Listagem foi um sucesso "// retorna a função

}

private fun editar(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("A lista está vazia")
        return false
    }
    listar()

    println("Digite a posição a ser editada:")
    val posicao = readln().toInt()

    println("O convidado vai? S/N")
    val resposta = readln().uppercase().trim()
    when (resposta) {
        "S" -> listaConvidados[posicao].presenca = true
        "N" -> listaConvidados[posicao].presenca = false
    }
    return true
}

private fun excluir(): Boolean {
    if (listaConvidados.isEmpty()) {
        println("A lista está vazia")
        return false
    }
    listar()
    println("Qual posição você deseja remover:")
    val posicao = readln().toInt()
    listaConvidados.removeAt(posicao)

    /* convidado.nome = ""
     convidado.alimentar = ""
     convidado.presente = ""
     convidado.presenca = false
     println("Convidar excluido ")*/

    println("Candidato removido")
    return true
}