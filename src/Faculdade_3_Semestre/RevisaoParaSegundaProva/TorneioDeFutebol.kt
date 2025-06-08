package Faculdade_3_Semestre.RevisaoParaSegundaProva

fun main (){

    val time1 : Map<String, Any> = mapOf(
        "GOL MARCADOS" to 2,
        "GOL SOFRIDOS" to 1,
        "TEMPO DA PARTIDA" to 100,
        "JOGADORES TITULARES" to  listOf("Gustavo, Neymar, Bomtempo, Messi"),
        "JOGADORES RESERVAS" to listOf("Zidane, Robinho, Kaka"),
        "JOGADORES SUBSTITUIDOS QUE SAÍRAM" to listOf("Neymar, Bomtempo, Messi"),
        "JOGADORES SUBSTITUIDOS QUE ENTRARAM" to listOf("Zidane, Robinho, Kaka"),
        "NOME DOS ARBITROS" to listOf("Darronco, Rafael Klaus"),
        "LATERAIS COBRADOS" to 20,
        "ESCANTEIOS COBRADOS" to 11,

        "DESCRIÇÃO DO PRIMEIRO GOL" to mapOf(
            "NOME DO JOGADOR" to "Messi",
            "TEMPO DO GOL" to 45.0,
            "TIPO DE GOL" to "falta"
        ),
        "DESCRIÇÃO DO SEGUNDO GOL" to mapOf(
            "NOME DO JOGADOR" to "Neymar",
            "TEMPO DO GOL" to 45.0,
            "TIPO DE GOL" to "Normal"
        ),

        "FALTAS COMETIDAS" to mapOf(
            "JOGADOR QUE SOFREU" to "Messi",
            "JOGADOR QUE COMETEU" to "Alex",
            "TEVE CARTÃO" to true,
            "TEVE LESÃO" to false
        )
    )

    val time2 : Map<String, Any> = mapOf(
        "GOL MARCADOS" to 2,
        "GOL SOFRIDOS" to 8,
        "TEMPO DA PARTIDA" to 100,
        "JOGADORES TITULARES" to  listOf("Alex, Cr7, Yuri Alberto, João"),
        "JOGADORES RESERVAS" to listOf("Marcelo, Richarlison, Cafu"),
        "JOGADORES SUBSTITUIDOS QUE SAÍRAM" to listOf(" Cr7, Yuri Alberto, João"),
        "JOGADORES SUBSTITUIDOS QUE ENTRARAM" to listOf("Marcelo, Richarlison, Cafu"),
        "NOME DOS ARBITROS" to listOf("Darronco, Rafael Klaus"),
        "LATERAIS COBRADOS" to 10,
        "ESCANTEIOS COBRADOS" to 5,

        "DESCRIÇÃO DO GOL" to mapOf(
            "NOME DO JOGADOR" to "",
            "TEMPO DO GOL" to 45.0,
            "TIPO DE GOL" to listOf("normal, falta, pênalti")
        ),
        "FALTAS COMETIDAS" to mapOf(
            "JOGADOR QUE SOFREU" to "Messi",
            "JOGADOR QUE COMETEU" to "Alex",
            "TEVE CARTÃO" to true,
            "TEVE LESÃO" to false
        )
    )


}