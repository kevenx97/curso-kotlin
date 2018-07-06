package funcoes

fun filtro(nomes: List<String>, filtro: (String) -> Boolean): List<String> {
    val listaFiltrada = ArrayList<String>()

    for(nome in nomes) {
        if(filtro(nome)) {
            listaFiltrada.add(nome)
        }
    }
    return listaFiltrada
}

fun filtrarNomesComTresLetras(nome: String): Boolean {
    return nome.length == 3
}

fun main(args: Array<String>) {
    val listaDeNomes = listOf("Bia", "Rose", "Gui", "Jak", "Diana")
    print(filtro(listaDeNomes, ::filtrarNomesComTresLetras))
}