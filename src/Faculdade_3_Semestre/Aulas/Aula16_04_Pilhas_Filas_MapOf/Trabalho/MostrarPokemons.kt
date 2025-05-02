package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun mostrarPokemons(pokemon: Map<String, Any>?, chave: String) {
    val pokemonsMap = pokemon?.get(chave) as? Map<String, String>
    if (pokemonsMap != null) {
        println("Pokémons disponíveis:")
        pokemonsMap.forEach { (index, nome) ->
            println("$index: $nome")
        }
    } else {
        println("Nenhum Pokémon encontrado.")
    }
}