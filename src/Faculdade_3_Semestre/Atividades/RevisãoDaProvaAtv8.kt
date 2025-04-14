package Faculdade_3_Semestre.Atividades

fun main() {
    val listaNomes = mutableListOf<String>()
    val listaNomesDoMeio = mutableListOf<String>()
    val listaSobrenomes = mutableListOf<String>()

    do {
        println("Digite seu nome completo: (Digite sair para sair!)")
        val nomeCompleto = readln()

        println("Seu nome é composto? s/n")
        val resposta = readln().lowercase()
        if (resposta == "s" && nomeCompleto != "sair") {
            listaNomes.add(nomeCompleto.substringBefore(" "))//Quebro o nome e fico somente com o que vem antes do espaço

            // EXEMPLO JOÃO MATHEUS SILVEIRO
            val aux = nomeCompleto.substringAfter(" ")// a nova String sera MATHEUS SILVEIRO
            listaNomesDoMeio.add(aux.substringBefore(" "))// finalmente pegamos o nome do meio
            listaSobrenomes.add(aux.substringAfter(" "))
        } else if (nomeCompleto != "sair") {
            listaNomes.add(nomeCompleto.substringBefore(" "))
            listaSobrenomes.add(nomeCompleto.substringAfter(" "))
        }
    } while (nomeCompleto != "sair")
    //Ordena ass listas em ordem alfabética
    listaNomes.sort()
    listaNomesDoMeio.sort()
    listaSobrenomes.sort()

    println("\nOs nomes são: ")
    listaNomes.forEach { nome ->
        println(" $nome - ")
    }//FIM DO NOME
    println("\nOs nomes do meio são:")
    listaNomesDoMeio.forEach { nome ->
        println(" $nome - ")
    }//FIM DO NOME DO MEIO
    println("\nOs sobrenomes são: ")
    listaSobrenomes.forEach { nome ->
        println(" $nome - ")
    }//FIM DO SOBRENOME

}