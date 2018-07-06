package funcoes

class Produto(val nome: String, val preco: Double)

infix fun Produto.maisCaroQue(produto: Produto): Boolean = this.preco > produto.preco

fun main(args: Array<String>) {
    val p1 = Produto("Ipad", 1253.11)
    val p2 = Produto(preco = 80.00, nome = "Controle")

    println(p1 maisCaroQue p2) // Infix
    println(p2.maisCaroQue(p1)) // Pradrão
}