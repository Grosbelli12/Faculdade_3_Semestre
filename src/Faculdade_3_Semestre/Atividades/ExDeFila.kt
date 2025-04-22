package Faculdade_3_Semestre.Atividades

import Faculdade_3_Semestre.Atividades.Paciente
import java.util.LinkedList


val fila = LinkedList<Paciente>()

fun main() {

    while (true) {
        if (fila.isEmpty()) {
            println("Médico está de prontidão para atender os recem chegados")
            Thread.sleep(2000)
        println("Os pacientes chegaram o médico vai começar a chamar eles por fila")
            Thread.sleep(1000)
        }
        adicionaPaciente()
        val paciente = fila.peek()
        println("Médico está chamando o ${paciente.nome} que é o primeiro da fila")
        var imc = paciente.peso / paciente.altura
        Thread.sleep((imc * 200).toLong())
        fila.removeFirst()
        Thread.sleep(2000)
    }
}

fun adicionaPaciente() {
    if (fila.isEmpty()) {
        fila.addLast(Paciente("Gustavo", 30, 78.2, 1.70, "23232323"))
        fila.addLast(Paciente("JOÃO", 37, 55.5, 1.50, "323818239"))
        fila.addLast(Paciente("Jose", 38, 79.8, 1.75, "323818239"))
    }
}



