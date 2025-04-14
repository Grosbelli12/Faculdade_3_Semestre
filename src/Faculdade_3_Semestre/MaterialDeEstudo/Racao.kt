package Faculdade_3_Semestre.MaterialDeEstudo

open class Racao {
        var preco = 0.0
        var peso = 0.0
        var sabor = ""


    open fun desconto(){
       preco *= 0.90
    }
}