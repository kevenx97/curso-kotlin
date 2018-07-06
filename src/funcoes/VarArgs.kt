package funcoes

fun ordenar(vararg numeros: Int, a: Int): IntArray {
    println(a)
    return numeros.sortedArray()
}

fun main(args: Array<String>) {
    for(numero in ordenar(564,7854,241,11,20,50,123,20,5,1, a = 1000)) {
        print("$numero ")
    }
}