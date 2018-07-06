package funcoes

// Funcoes que não precisam estar dentro de classes (Top Level)
fun menorValor(a: Int, b: Int): Int = if (a < b) a else b

fun main(args: Array<String>) {
    println("O menor valor é ${menorValor(10, 5)}")
}