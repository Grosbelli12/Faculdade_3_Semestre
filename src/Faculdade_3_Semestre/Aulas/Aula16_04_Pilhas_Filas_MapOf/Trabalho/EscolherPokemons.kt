package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun escolherTresPokemons(pokemon: Map<String, Any>?, chave: String,quantidade :Int ): Map<String, String> {
    val pokemonsMap = pokemon?.get(chave) as? Map<String, String>
    if (pokemonsMap == null) {
        println("Nenhum Pokémon encontrado.")
        return emptyMap()
    }

    val escolhidos = mutableMapOf<String, String>()
    while (escolhidos.size < quantidade ) {
        println("Escolha o índice do Pokémon (0 a ${pokemonsMap.size - 1}):")
        val pkmnEscolhido = readLine()
        if (pkmnEscolhido != null && pkmnEscolhido in pokemonsMap) {
            val pokemonEscolhido = pokemonsMap[pkmnEscolhido]
            if (pokemonEscolhido != null && pokemonEscolhido !in escolhidos.values) {
                escolhidos[pkmnEscolhido] = pokemonEscolhido
                println("$pokemonEscolhido foi adicionado à sua equipe.")
            } else {
                println("Você já escolheu $pokemonEscolhido. Escolha outro.")
            }
        } else {
            println("Índice inválido. Tente novamente.")
        }
    }
    return escolhidos
}