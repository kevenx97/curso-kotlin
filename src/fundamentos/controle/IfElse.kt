package fundamentos.controle

fun main(args: Array<String>) {
    val nota: Double = 8.3

    // IF PADRÃO
    if(nota >= 7.0) {
        println("Aprovado")
    } else {
        println("Reprovado")
    }

    // IF USADO COMO EXPRESSÂO
    val num1: Int = 2
    val num2: Int = 5

    val maiorValor = if (num1 > num2) {
        println("processando if...")
        num1 // ultima linha será sempre o valor retornado pela expressão
    } else {
        println("processando else...")
        num2
    }

    println("O maior valor é $maiorValor.")
}