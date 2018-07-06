package funcoes

class Operador {
    fun soma(a: Int, b: Int): Int {
        return a + b
    }
}

fun soma(a: Int, b: Int): Int {
    return a + b
}

fun calc(a: Int, b: Int, funcao: (Int, Int) -> Int): Int {
    return funcao(a, b)
}

fun main(args: Array<String>) {
    println(calc(5, 10, ::soma))
    println(calc(a = 3, b = 6, funcao = Operador()::soma))
}

