package Faculdade_3_Semestre.Atividades
fun main() {
    var aux = 0
    var n1 = 1
    var n2 = 2
    var casaDecimal = 0

    while ( casaDecimal <= 3) {
        println("Diga uma casa decimal acima da 3°:")
        casaDecimal = readLine()!!.toInt()

        for (i in 4..casaDecimal) {
            aux = n2
            n2 = n2 + n1
            n1 = aux
        }
        println(n2)
    }
}