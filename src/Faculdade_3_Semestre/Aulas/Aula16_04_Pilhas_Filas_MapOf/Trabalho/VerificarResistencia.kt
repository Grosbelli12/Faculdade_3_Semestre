package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun verSeTemResistencia(pokemon: Map<String, Any>?, chave: String, tipoAtq: String): Boolean {

    val resistenciasPkmn = pokemon?.get(chave) as? List<*>

    val temResistenciaOuNao = resistenciasPkmn?.contains(tipoAtq) == true

    return temResistenciaOuNao
}
