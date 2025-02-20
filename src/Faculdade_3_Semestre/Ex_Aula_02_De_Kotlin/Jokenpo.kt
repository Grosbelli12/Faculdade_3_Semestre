package Faculdade_3_Semestre.Ex_Aula_02_De_Kotlin

fun main() {


    var resposta = 0
    var verificador = 0

do{
    println("Digite 1 para tesoura 2 para pedra e 3 para papel")
    resposta = readLine()!!.toInt()

    val escolhaAleatoria = listOf( 1, 2 ,3 )
    val resposta2 = escolhaAleatoria.random()
    if (resposta2 == resposta) {
        println("Empate tente novamente!")
    }else if(resposta2 > resposta){
        println("Você perdeu tente novamente!")
    }else{
        println("você ganhou! parabéns")
        verificador++
}
    }while (verificador < 1)

}