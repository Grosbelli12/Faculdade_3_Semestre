package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun mostrarPokemon(mapaPokemon: Map<Int, Map<String, Any>>) {
    println("Pokémons disponíveis:")
    mapaPokemon.forEach { (chave, valor) ->
        val dadosPokemon = valor as? Map<*, *>
        val nomePokemon = dadosPokemon?.get("NOME") as? String
        println("$chave: $nomePokemon")
    }
}