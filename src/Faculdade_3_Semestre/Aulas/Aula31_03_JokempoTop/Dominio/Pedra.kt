package Faculdade_3_Semestre.Aulas.Aula31_03_JokempoTop.Dominio

class Pedra {

    fun luta(elemento : String): Int{
        if(elemento.equals("PAPEL")){ //PERDE
            println("Você perdeu!")
           return -1 //perdi pontos
        }
        if (elemento.equals("TESOURA")){ //GANHA
            println("Você ganhou!")
            return 1 // ganhei pontos
        }
        println("Você empatou!")
        return 0 //empate
    }
}
