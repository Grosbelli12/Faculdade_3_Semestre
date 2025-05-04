package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun timeProfessor(mapaTodosPokemon: Map<Int, Map<String, Any>>, qtdePokemon: Int): MutableMap<Int, Map<String, Any>?> {
    val timeProfessor =  mutableMapOf<Int, Map<String, Any>?>()

    val pokemonsProfessor = mapOf(0 to 130,1 to 59, 2 to  3)
    for (i in 0 .. qtdePokemon) {
        val chave = pokemonsProfessor[i]
        timeProfessor[i] = mapaTodosPokemon[chave]
    }
    return timeProfessor
}