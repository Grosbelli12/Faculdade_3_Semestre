package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun verSeTemNulidade(pokemon: Map<String, Any>?, chave: String, tipoDoAtq: String): Boolean {
    val elementosPkmn = pokemon?.get(chave) as List<*>
    return (elementosPkmn.contains("FANTASMA") && tipoDoAtq == "NORMAL") ||
            (elementosPkmn.contains("NORMAL") && tipoDoAtq == "FANTASMA") ||
            (elementosPkmn.contains("VOADOR") && tipoDoAtq == "TERRESTRE") ||
            (elementosPkmn.contains("FANTASMA") && tipoDoAtq == "LUTADOR")
}