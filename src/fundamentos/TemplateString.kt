package fundamentos

fun main(args: Array<String>) {
    val aprovados = listOf("João", "Rosana", "Maria", "Pedro")
    println("O primeiro colocado foi ${aprovados[0]}")

    val bomHumor = true
    println("Hoje estou ${if (bomHumor) "feliz" else "chateado"}.")
}