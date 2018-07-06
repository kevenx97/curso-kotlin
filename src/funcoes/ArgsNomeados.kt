package funcoes

fun relacaoDeTrabalho(chefe: String, funcionario: String): String {
    return "$funcionario é subordinado(a) à $chefe"
}

fun main(args: Array<String>) {
    println(relacaoDeTrabalho("João", "Maria")) // SEM NOMEAR ARGUMENTOS
    println(relacaoDeTrabalho(funcionario = "João", chefe = "Maria")) // NOMEANDO ARGUMENTOS
}