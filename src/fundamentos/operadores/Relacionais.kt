package fundamentos.operadores

import java.util.*

fun main(args: Array<String>) {
    val d1 = Date(0)
    val d2 = Date(0)

    // Igualdade referencial
    println("Resultado com '===' ${d1 === d2}")

    // Igualdade estrutural
    println("Resultado com '==' ${d1 == d2}")
}