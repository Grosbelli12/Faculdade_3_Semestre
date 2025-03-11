package Faculdade_3_Semestre.Atividades

fun main() {

    var saldo = 1000.0
    var valor = 0.0

    while (true) {
        println("Saldo atual: R$ $saldo")
        println("1 - Sacar")
        println("2 - Depositar")
        println("3 - Sair")
        println("Escolha uma opção: ")

        var opcao = readLine()?.toIntOrNull() ?: 0

        if (opcao == 1) {
            println("Digite o valor para sacar: ")
            valor = readLine()?.toDoubleOrNull() ?: 0.0

            if (valor > saldo) {
                println("Saldo insuficiente!")
            } else {
                saldo -= valor
                println("Saque realizado!")
            }
        } else if (opcao == 2) {
            println("Digite o valor para depositar:")
            valor = readLine()?.toDoubleOrNull() ?: 0.0
            saldo += valor
            println("Depósito realizado!")
        } else if (opcao == 3) {
            println("Saindo...")
            break
        } else {
            println("Opção inválida.")
        }
    }
}