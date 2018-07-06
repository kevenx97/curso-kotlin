package fundamentos

fun main(args: Array<String>) {
    // Chamada de função sem retorno
    imprimirSoma(4, 5)

    // Chamada de funções com retorno
    println(soma(2, 6))
    println(soma(4))
}

// Função sem retorno
fun imprimirSoma(a: Int, b: Int) {
    println(a + b)
}

// Função com retorno
fun soma(a: Int, b: Int = 1): Int {
    return a + b
}