package poo.exemplo.collections.interfacecollection

import poo.exemplo.interfaces.ContaCorrente

//Exemplo de uso de interface de leitura
fun mostrarTudo(listaPalavras: Collection<String>) {
    for(palavra in listaPalavras) {
        println(palavra)
    }
}

fun main() {
    //Exemplo de uso de interface de leitura
    val listaPalavras = listOf("bola", "dado", "suco")
    mostrarTudo(listaPalavras)

    //Exemplo de uso de interface mutavel
    val listaBandas = mutableListOf<String>()

    listaBandas.addAll(listaPalavras)
    listaBandas.add("Aerosmith")
    mostrarTudo(listaBandas)
}