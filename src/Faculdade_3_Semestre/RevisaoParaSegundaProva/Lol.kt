package Faculdade_3_Semestre.RevisaoParaSegundaProva

import java.sql.Time

fun main() {

    val jogador1Status = mapOf(
        "Dano Total" to 690.56,
        "Dano Médio" to 60.0,
        "Dano Sofrido Médio" to 40.0,
        "Distância Percorrida" to 20.0,
        "Numero De Mortes" to 5,
        "Numero de Abatimentos" to 25
    )

    val jogador2Status = mapOf(
        "Dano Total" to 600.50,
        "Dano Médio" to 50.0,
        "Dano Sofrido Médio" to 30.0,
        "Distância Percorrida" to 15.0,
        "Numero De Mortes" to 3,
        "Numero de Abatimentos" to 15
    )

    val jogador3Status = mapOf(
        "Dano Total" to 490.00,
        "Dano Médio" to 35.0,
        "Dano Sofrido Médio" to 25.0,
        "Distância Percorrida" to 10.0,
        "Numero De Mortes" to 2,
        "Numero de Abatimentos" to 4
    )

    val jogador4Status = mapOf(
        "Dano Total" to 550.45,
        "Dano Médio" to 45.0,
        "Dano Sofrido Médio" to 55.0,
        "Distância Percorrida" to 23.0,
        "Numero De Mortes" to 2,
        "Numero de Abatimentos" to 8
    )

    val time: Map<String, Map<String, Any>> = mapOf(
        "jogador1Status" to jogador1Status,
        "jogador2Status" to jogador2Status,
        "jogador3Status" to jogador3Status,
        "jogador4Status" to jogador4Status
    )


    val metrica1 = "Dano Total"

    val danoTotalJogador1 = jogador1Status[metrica1] as Double ?: 0.0
    val danoTotalJogador2 = jogador2Status[metrica1] as Double ?: 0.0
    val danoTotalJogador3 = jogador3Status[metrica1] as Double ?: 0.0
    val danoTotalJogador4 = jogador4Status[metrica1] as Double ?: 0.0

    val mediaDanoTotal = (danoTotalJogador1 + danoTotalJogador2 + danoTotalJogador3 + danoTotalJogador4) / 4


    val metrica2 = "Dano Médio"

    val danoMedioJogador1 = jogador1Status[metrica2] as Double ?: 0.0
    val danoMedioJogador2 = jogador2Status[metrica2] as Double ?: 0.0
    val danoMedioJogador3 = jogador3Status[metrica2] as Double ?: 0.0
    val danoMedioJogador4 = jogador4Status[metrica2] as Double ?: 0.0


    val mediaDanoMedio = (danoMedioJogador1 + danoMedioJogador2 + danoMedioJogador3 + danoMedioJogador4) / 4

    val metrica3 = "Dano Sofrido Médio"

    val danoSofridoMedioJogador1 = jogador1Status[metrica3] as Double ?: 0.0
    val danoSofridoMedioJogador2 = jogador2Status[metrica3] as Double ?: 0.0
    val danoSofridoMedioJogador3 = jogador3Status[metrica3] as Double ?: 0.0
    val danoSofridoMedioJogador4 = jogador4Status[metrica3] as Double ?: 0.0

    val mediaDanoSofrido =
        (danoSofridoMedioJogador1 + danoSofridoMedioJogador2 + danoSofridoMedioJogador3 + danoSofridoMedioJogador4) / 4


    val metrica4 = "Distância Percorrida"

    val distanciaPercorridaJogador1 = jogador1Status[metrica4] as? Double ?: 0.0
    val distanciaPercorridaJogador2 = jogador2Status[metrica4] as? Double ?: 0.0
    val distanciaPercorridaJogador3 = jogador3Status[metrica4] as? Double ?: 0.0
    val distanciaPercorridaJogador4 = jogador4Status[metrica4] as? Double ?: 0.0

    val mediaDistanciaPercorrida =
        (distanciaPercorridaJogador1 + distanciaPercorridaJogador2 + distanciaPercorridaJogador3 + distanciaPercorridaJogador4) / 4.0


    val metrica5 = "Numero De Mortes"

    // Cast to Double for consistent calculations, even if original is Int
    val numeroDeMortesJogador1 = jogador1Status[metrica5] as? Int ?: 0
    val numeroDeMortesJogador2 = jogador2Status[metrica5] as? Int ?: 0
    val numeroDeMortesJogador3 = jogador3Status[metrica5] as? Int ?: 0
    val numeroDeMortesJogador4 = jogador4Status[metrica5] as? Int ?: 0

    val mediaNumeroDeMortes =
        (numeroDeMortesJogador1 + numeroDeMortesJogador2 + numeroDeMortesJogador3 + numeroDeMortesJogador4) / 4.0


    val metrica6 = "Numero de Abatimentos"

    val numeroDeAbatimentosJogador1 = jogador1Status[metrica6] as? Int ?: 0
    val numeroDeAbatimentosJogador2 = jogador2Status[metrica6] as? Int ?: 0
    val numeroDeAbatimentosJogador3 = jogador3Status[metrica6] as? Int ?: 0
    val numeroDeAbatimentosJogador4 = jogador4Status[metrica6] as? Int ?: 0

    val mediaNumeroDeAbatimentos =
        (numeroDeAbatimentosJogador1 + numeroDeAbatimentosJogador2 + numeroDeAbatimentosJogador3 + numeroDeAbatimentosJogador4) / 4.0

    println(
        "A média dos status da equipe em cada status foi:\n$metrica1: $mediaDanoTotal" +
                "\n$metrica2: $mediaDanoMedio s" +
                "\n$metrica3: $mediaDanoSofrido s" +
                "\n$metrica4: $mediaDistanciaPercorrida" +
                "\n$metrica5: $mediaNumeroDeMortes" +
                "\n$metrica6: $mediaNumeroDeAbatimentos"
    )
}

