package Faculdade_3_Semestre.Aulas.Aula02.Teste
import Faculdade_3_Semestre.Aulas.Aula02.Dominio.Convidado
fun main() {
    menu()
}
var convidado: Convidado = Convidado()

private fun menu(){
    do {

        println("---MENU---")
        println("1- CADASTRAR")
        println("2- LISTAR")
        println("3- EDITAR")
        println("4- EXCLUIR")
        println("0- SAIR")

        val opcao = readLine()!!.toInt()//Validar



        when(opcao){
            1-> {
                print("Cadastrando...")
                convidado = cadastrar()
            }
            2-> {
                print("listando...")
                listar(convidado)

            }
            3-> {
                print("Editando...")

            }
            4-> print("Excluindo...")
            0-> print("Saindo...")
        }
    }while (opcao != 0)
}

 private fun cadastrar(): Convidado{
    //Instância
    var convidado = Convidado()

    print("Qual é o seu nome? ")
    //val nome = readln()
    convidado.nome = readln()

    print("Qual vai ser o seu presente? ")
    //val presente = readln()
    convidado.presente = readln()

    print("Qual sua resitrição alimentar? ")
    //val alimento = readln()
    convidado.alimentar = readln()
    return convidado
}

private fun listar(convidado: Convidado){
    print("Nome: ${convidado.nome}; " +
            " Presente: ${convidado.presente}; " +
            " Restrição:${convidado.alimentar}; " +
            " Vai ir a festa? ${convidado.presenca};")
}
