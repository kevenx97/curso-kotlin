package fundamentos.controle

fun main(args: Array<String>) {
    // CRESCENTE
    for(i in 0..4) {
        println(i)
    }

    // DECRESCENTE
    for(i in 5 downTo 0) {
        println(i)
    }

    // MUDANDO INCREMENTO
    for(i in 0..25 step 5) {
        println(i)
    }

    // PERCORRENDO ARRAYLIST
    val alunos = arrayListOf("André", "Moscoso", "Tarantula")

    for((index, item) in alunos.withIndex()) {
        println("${index + 1} - $item")
    }
}