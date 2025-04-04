package Faculdade_3_Semestre.MaterialDeEstudo

import java.util.Calendar

fun main() {

    // Lista de 30 frases motivacionais sem pontos extras antes das vírgulas
    val lista = listOf(
        "Acredite em si mesmo e todo o resto virá naturalmente.",
        "Cada passo, por menor que seja, te aproxima do seu objetivo.",
        "Desafios são oportunidades disfarçadas de dificuldades.",
        "Nunca é tarde para recomeçar e transformar sua história.",
        "A persistência supera a resistência: continue sempre!",
        "Seja a mudança que você deseja ver no mundo.",
        "O sucesso nasce do esforço e da coragem de tentar.",
        "Você é capaz de alcançar grandes feitos; acredite nisso.",
        "Não espere por oportunidades, crie-as!",
        "Sonhar grande é o primeiro passo para transformar sonhos em realidade.",
        "Cada dia é uma nova chance para melhorar e evoluir.",
        "O impossível é apenas o possível esperando para acontecer.",
        "A jornada pode ser longa, mas cada conquista faz valer a pena.",
        "Desafie seus limites e surpreenda-se com sua capacidade.",
        "A determinação de hoje constrói o sucesso de amanhã.",
        "Erros são degraus no caminho para o sucesso.",
        "Transforme suas dificuldades em combustível para a vitória.",
        "Acredite no poder dos seus sonhos e lute por eles.",
        "Não se compare com os outros; compare-se com quem você era ontem.",
        "Cada pequena vitória é um grande passo rumo à conquista.",
        "Você tem a força dentro de si para vencer qualquer obstáculo.",
        "Persistir, mesmo quando parece difícil, é o caminho para a excelência.",
        "A coragem de começar é o primeiro ato de superação.",
        "O sucesso é construído dia após dia, com dedicação e amor.",
        "Seja grato pelo que você tem e trabalhe para conquistar o que deseja.",
        "A vida recompensa aqueles que nunca desistem de lutar.",
        "Coloque seu coração em tudo que fizer e a vitória será certa.",
        "A energia positiva é o que transforma sonhos em realidade.",
        "Cada desafio enfrentado é uma lição que fortalece a alma.",
        "Acredite que você pode, e você já está no meio do caminho."
    )

    val calendar = Calendar.getInstance()
    val hora = calendar.get(Calendar.HOUR_OF_DAY)
    val minuto = calendar.get(Calendar.MINUTE)


    val frase = lista.random()

    println("Chegou a hora da sua frase motivacional: $hora:00 $frase")
}
