package fundamentos

fun exibirNotas(nota: Any) {
    when(nota as? Int) {
        10, 9 -> println("A")
        8, 7 -> println("B")
        6, 5  -> println("C")
        4, 3 -> println("D")
        2, 1, 0 -> println("E")
    }
}

fun main(args: Array<String>) {
    val notas = arrayListOf(9.2, 7.6, 4.1, 0.5)
    for(nota in notas) {
        exibirNotas(nota.toInt())
    }
}