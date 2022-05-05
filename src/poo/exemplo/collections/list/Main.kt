package poo.exemplo.collections.list

fun main() {
    val listaNumerosEscritos = listOf("um", "dois", "três")
    println("O tamanho da lista é:  ${listaNumerosEscritos.size}")
    println("O elemento na posição 0 é: ${listaNumerosEscritos.get(0)}")
    println("O elemento na posição 2 é: ${listaNumerosEscritos[2]}")
    println("O index do elemento \"dois: \" ${listaNumerosEscritos.indexOf("dois")}")
    println("O index do elemento \"cinco: \" ${listaNumerosEscritos.indexOf("cinco")}")

    println("---------- Exemplo de mutableListOf()----------")

    val listaNumerosMutaveis = mutableListOf(2, 55, 10)
    println(listaNumerosMutaveis)

    listaNumerosMutaveis.add(50)
    listaNumerosMutaveis.add(100)
    listaNumerosMutaveis.add(300)
    println(listaNumerosMutaveis)

    listaNumerosMutaveis.removeAt(0)
    listaNumerosMutaveis.remove(40)
    println(listaNumerosMutaveis)

    //Embaralha a ordem dos elementos
    listaNumerosMutaveis.shuffle()

    //Ordem crescente os elementos
    listaNumerosMutaveis.sort()
    println(listaNumerosMutaveis)

    println("---------- Exemplo de ArrayList----------")


    val listaSalarios = ArrayList<Double>()
    listaSalarios.add(3500.00)
    listaSalarios.add(500.00)
    listaSalarios.add(4560.00)

    listaSalarios.remove(3500.00)
    listaSalarios.removeAt(1)
    listaSalarios.clone()
    println(listaSalarios)

}