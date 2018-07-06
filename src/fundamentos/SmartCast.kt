package fundamentos

fun ImSmartIf(valor: Any) {
    if(valor is String) {
        println(valor.toUpperCase())
    } else if (valor is Int) {
        println(valor.plus(3))
    }
}

fun ImSmartWhen(valor: Any) {
    when(valor) {
        is String -> println(valor.first())
        is Int -> println(valor.minus(2))
        else -> println("Pense bem meu caro!")
    }
}

fun main(args: Array<String>) {
    ImSmartIf("Show")
    ImSmartIf(10)

    ImSmartWhen("Kevão")
    ImSmartWhen(5)
    ImSmartWhen(true)
}