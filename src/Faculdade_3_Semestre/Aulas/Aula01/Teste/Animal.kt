package Faculdade_3_Semestre.Aulas.Aula01.Teste

//Atividade: Crie uma classe animal
//Atributos: Nome Ciêntifico, Espécie, Dieta, Habitat
//Essa nossa classe é uma superclasse
//A palavra OPEN é usada para indicar que uma classe pode ser herdada.


open class Animal {
    //Atributos
    var nomeCientifico = ""
    var especie = ""
    var dieta = ""
    var habitat = ""

    /*ENCAPSULAMENTO: É uma forma de controle sobre
    * os atributos, quem pode acessar ou não */

open fun somAnimal() : String {
        return "Faz um barulho"
    }
}