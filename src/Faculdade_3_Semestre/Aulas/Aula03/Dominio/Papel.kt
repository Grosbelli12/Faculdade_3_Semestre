package Faculdade_3_Semestre.Aulas.Aula03.Dominio

class Papel {

    fun luta(elemento : String): Int{
        if(elemento.equals("TESOURA")){ // PERDE
            println("Você perdeu!")
         return -1 //perdi pontos
        }
        if (elemento.equals("PEDRA")){ //GANHA
            println("Você ganhou!")
           return 1 // ganhei pontos
        }
        println("Você empatou!")
        return 0 //empate
    }
}