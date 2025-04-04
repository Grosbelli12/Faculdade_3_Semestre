package Faculdade_3_Semestre.MaterialDeEstudo

fun main() {
    println("Digite o texto que você deseja procurar palavras repetidas")
    val texto = readln()

    println("Digite a palavra que deseja saber quantas vezes ela repetiu")
    val palavra = readln()

    val regex = Regex("\\b${Regex.escape(palavra)}\\b")
    val contagem = regex.findAll(texto).count()

    println("A palavra '$palavra' aparece $contagem vezes.")
}
