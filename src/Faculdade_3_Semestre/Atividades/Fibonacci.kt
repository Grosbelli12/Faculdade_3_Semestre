/*fun main() {
    var n1 = 2
    var n2 = 1
    var aux = 0
    var jogo   = 0


    jogo= readln().toInt()


    if (n1 > 3) {
        while (true) {
            aux = jogo
            n2 = n1 + n2
            aux = aux + n2
            break
        }
    }

    print(jogo)
}*/

fun main(){
    //Cria uma variável regex para criar um padrão definidor de respostas corretas
    val regex = Regex("^(?:[2-9]|\\d{2,})$")
    var num: String

    do {
        println("Digita")
        num = readln()
    } while(!regex.matches(num))

    println(calcFibonacci(num.toInt()))

}
fun calcFibonacci(n: Int) : Int{
    if(n<= 1){
        return n
    }

    return calcFibonacci(n - 1) + calcFibonacci(n - 2)
}