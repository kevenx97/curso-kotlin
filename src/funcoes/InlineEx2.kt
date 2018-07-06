package funcoes

inline fun <T> exe(nomeFuncao: String, funcao: () -> T): T {
    println("O método $nomeFuncao foi inicializado")
    try {
        return funcao()
    } finally {
        println("O método $nomeFuncao foi concluído")
    }
}

fun funcaoSomar(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
    val resultado = exe("Somar", {
        funcaoSomar(7, 4)
    })

    println("O resultado do método foi: $resultado")
}