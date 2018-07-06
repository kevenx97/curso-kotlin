package fundamentos

fun main(args: Array<String>) {
    var a: Int
    var b = 10 // Tipo inferido

    // Declaração de constantes
    val c: Int = 10
    val d = 16

    a = 2

    println(a + b)
    println(c)
    println(d)

    // Usando class Math da API do Java
    val raio = 4.5
    print(raio * raio * Math.PI)
}