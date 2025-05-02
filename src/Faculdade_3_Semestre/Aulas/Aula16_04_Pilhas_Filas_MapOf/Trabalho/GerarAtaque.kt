package Faculdade_3_Semestre.Aulas.Aula16_04_Pilhas_Filas_MapOf.Trabalho

fun gerarDanoAtaque(pokemon: Map<String, Any>?, chave: String, ataque: Int, valorAtq: Int): Double {

    val ataques = pokemon?.get(chave) as? Map<*, *>

    val ataqueSelecionado = ataques?.get(ataque) as? List<*>

    val danoDoAtaque = ataqueSelecionado?.get(valorAtq) as Double

    return danoDoAtaque

}