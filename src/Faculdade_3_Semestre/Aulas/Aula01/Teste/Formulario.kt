package Faculdade_3_Semestre.Aulas.Aula01.Teste

import Faculdade_3_Semestre.Aulas.Aula01.Dominio.Animal
import Faculdade_3_Semestre.Aulas.Aula01.Dominio.Cachorro
import Faculdade_3_Semestre.Aulas.Aula01.Dominio.Gato

fun main() {

//pedidoInformacoes()
    //Formulario Nome, Idade, Peso, Altura
    //A aplicacao precisa calcular IMC

/*
fun pedidoInformacoes() {
    val p: Pessoa = Pessoa();
    println("Digite seu nome: ")
    p.nome = readln()
    println("Digite sua idade: ")
    p.idade = readLine()?.toIntOrNull() ?: 0
    println("Digite seu peso: ")
    p.peso = readLine()?.toDoubleOrNull() ?: 0.0
    println("Digite sua altura: ")
    p.altura = readln().toDoubleOrNull() ?: 0.0
    var imc = String.format("%.2f", calculoIMC(p.peso, p.altura))
    println(p.nome+", o seu IMC é $imc")
}

fun calculoIMC(peso: Double, altura: Double): Double {
    return peso / (altura * altura);
}*/

//Atividade: Crie uma classe Animal
//Atributos: Nome Ciêntifico, Especie, Dieta, Habitat

    val gato: Gato = Gato()
    gato.nomeCientifico= "gato"
    gato.habitat = "domestico"
    gato.especie = "felino"
    gato.dieta = "peixe"


    /*
        Jeito paia do objeto "gato" da classe "Gato" receber os valores do objeto agora apagado "animal":
        val gato : Gato = animal as gato
     */
    println(gato.nomeCientifico)


val cachoro: Cachorro = Cachorro()
cachoro.nomeCientifico= "gato"
cachoro.habitat = "domestico"
cachoro.especie = "felino"
cachoro.dieta = "peixe"

println(cachoro.somAnimal())
 val animal  = Animal()
    println(animal.somAnimal())

    /*
    * Toda Classe começa com letra Maiuscula
    * e segue o padrão CamelCase
    * Exemplo: MinhaClasse
    *



    */
}

