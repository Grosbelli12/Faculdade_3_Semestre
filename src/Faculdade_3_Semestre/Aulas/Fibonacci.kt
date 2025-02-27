package Faculdade_3_Semestre.Aulas

 fun main (){
     var n1 = 2
     var n2 = 1
     var aux = 0
     var casaDecimal = 0

     println("Digite um número (mínimo 3) para a sequencia de Fibonacci: ")
      casaDecimal = readLine()!!.toInt()

     if (casaDecimal > 3) {
         aux = n2
         n2 = n1 + aux
         aux = n2
     }
     println(n2)
 }