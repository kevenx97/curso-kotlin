package funcoes

inline fun transacao(a: Int = 10, funcao: () -> Unit) {
    println("Iniciando transação...")
    try {
        funcao()
    } finally {
        println("Encerrando transação...")
    }
}

fun main(args: Array<String>) {
    // Chamada sem parâmetro
    transacao {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
    }

    // Chamada com parâmetro ex 1
    transacao(20) {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
    }

    // Chamada com parâmetro ex 2
    transacao(20, {
        println("Executando SQL 1...")
        println("Executando SQL 2...")
    })
}