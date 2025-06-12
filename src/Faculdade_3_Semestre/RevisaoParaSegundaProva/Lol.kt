package Faculdade_3_Semestre.RevisaoParaSegundaProva

fun main() {

    val jogador1Status = mapOf(
        "Dano Total" to 690.56,
        "Dano Médio" to 60.0,
        "Dano Sofrido Médio" to 40.0,
        "Distância Percorrida" to 20.0,
        "Numero De Mortes" to 5,
        "Numero De Abatimentos" to 25
    )

    val jogador2Status = mapOf(
        "Dano Total" to 600.50,
        "Dano Médio" to 50.0,
        "Dano Sofrido Médio" to 30.0,
        "Distância Percorrida" to 15.0,
        "Numero De Mortes" to 3,
        "Numero De Abatimentos" to 15
    )

    val jogador3Status = mapOf(
        "Dano Total" to 490.00,
        "Dano Médio" to 35.0,
        "Dano Sofrido Médio" to 25.0,
        "Distância Percorrida" to 10.0,
        "Numero De Mortes" to 2,
        "Numero De Abatimentos" to 4
    )

    val jogador4Status = mapOf(
        "Dano Total" to 550.45,
        "Dano Médio" to 45.0,
        "Dano Sofrido Médio" to 55.0,
        "Distância Percorrida" to 23.0,
        "Numero De Mortes" to 2,
        "Numero De Abatimentos" to 8
    )

    val time = mapOf(
        1 to jogador1Status,
        2 to jogador2Status,
        3 to jogador3Status,
        4 to jogador4Status
    )
    var danoTotal = 0.0
    var danoMedioTotal = 0.0
    var danoTotalSofrido = 0.0
    var distanciaTotalPercorrida = 0.0
    var totalDeMortes = 0.0
    var totalDeAbatimentos = 0.0

    time.values.forEach { jogador ->
        val danoJogador = jogador["Dano Total"] as Double
        val danoMedio = jogador["Dano Médio"] as Double
        val danoSofrido = jogador["Dano Sofrido Médio"] as Double
        val distanciaPercorrida = jogador["Distância Percorrida"] as Double
        val numeroDeMortes = jogador["Numero De Mortes"] as Int
        val numeroDeAbatimentos = jogador["Numero De Abatimentos"] as Int

         danoTotal += danoJogador
         danoMedioTotal += danoMedio
         danoTotalSofrido += danoSofrido
         distanciaTotalPercorrida += distanciaPercorrida
         totalDeMortes += numeroDeMortes
         totalDeAbatimentos += numeroDeAbatimentos

    }
    println(
        "A média dos status da equipe em cada status foi:\n Dano Total: ${danoTotal / 4} " +
                "\n Dano Médio : ${danoMedioTotal / 4}" +
                "\n Dano Sofrido Médio: ${danoTotalSofrido / 4} s" +
                "\n Distância Percorrida: ${distanciaTotalPercorrida / 4}" +
                "\n Numero De Mortes: ${totalDeMortes / 4}" +
                "\n Numero de Abatimentos: ${totalDeAbatimentos / 4}"
    )
}

