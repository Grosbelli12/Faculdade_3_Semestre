package Faculdade_3_Semestre.RevisaoParaSegundaProva

fun main(){

        val matematica = mapOf(
            6.1 to "Pedrinho",
            4.0 to "Paulo",
            8.5 to "Carlos"
        )

        val  ciencias = mapOf(
            9.0 to "Pedrinho",
            8.0 to "Paulo",
            8.5 to "Carlos"
        )

        val portugues = mapOf(
            3.0 to "Pedrinho",
            9.5 to "Paulo",
            8.0 to "Carlos"
        )
        val educacao_fisica = mapOf(
            10.0 to "Pedrinho",
            8.5 to "Paulo",
            9.0 to "Carlos"
        )

        val historia = mapOf(
            7.0 to "Pedrinho",
            6.5 to "Paulo",
            8.0 to "Carlos"
        )


    for ((chave,valor) in matematica ){
        val aluno = matematica[chave]

        if (chave >= 7.0){
                println("$valor tirou $chave passou de ano")
        }else(
            println("$valor tirou $chave reprovou de ano")
        )
    }
}