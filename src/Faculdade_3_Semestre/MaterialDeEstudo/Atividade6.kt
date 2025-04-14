package Faculdade_3_Semestre.MaterialDeEstudo

fun main (){
    val racaoGato: RaçãoDeGato = RaçãoDeGato()

    racaoGato.preco = 190.0
    racaoGato.peso = 5.0
    racaoGato.sabor = "Bacon"
    racaoGato.paraCastrado = false
    racaoGato.desconto()
    println("Preço da ração para gato após desconto: ${racaoGato.preco}")


    val  racaoCachorro: RaçãoDeCachorro = RaçãoDeCachorro()
    racaoCachorro.preco = 200.0
    racaoCachorro.peso = 5.0
    racaoCachorro.sabor = "Bacon"
    racaoCachorro.pedacosComCarne = false
    racaoCachorro.desconto()
    println("Preço da ração para cachorro após desconto: ${racaoCachorro.preco}")
}