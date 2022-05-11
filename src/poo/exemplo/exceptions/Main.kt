package poo.exemplo.exceptions

fun main() {
    try {
        println("Digite um número inteiro: ")
        val dividendo:Int = readln().toInt()

        println("Digite outro número inteiro: ")
        val divisor:Int = readln().toInt()

        val resultado = dividendo / divisor
        println("O resultado é: $resultado")

    } catch (exception: Exception) {
        exception.message
    }
    finally {
        println("Obrigada por usar o sistema!")
    }
}