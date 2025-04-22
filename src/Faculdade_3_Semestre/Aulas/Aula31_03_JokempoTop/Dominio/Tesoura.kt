package Faculdade_3_Semestre.Aulas.Aula31_03_JokempoTop.Dominio

class Tesoura {

    fun luta(elemento : String): Int{
        if(elemento.equals("PEDRA")){ // PERDE
            println("Você perdeu!")
            return -1 //perdi pontos
        }
        if (elemento.equals("PAPEL")){ //GANHA
            println("Você ganhou!")
            return 1 // ganhei pontos
        }
        println("Você empatou!")
        return 0 //empate
    }
}