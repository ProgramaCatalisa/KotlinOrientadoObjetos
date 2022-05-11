package poo.exemplo.srp.exercicio4lista23.simplificado

fun main() {
    val dicionarioObjetos = mutableMapOf<String, String>()

    dicionarioObjetos["bola"] = "azul"
    dicionarioObjetos["boneca"] = "amarela"
    dicionarioObjetos["dado"] = "rosa"

    dicionarioObjetos.forEach { chave, valor ->
        println("$chave -> $valor")
    }
}