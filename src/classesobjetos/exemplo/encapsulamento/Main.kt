package classesobjetos.exemplo.encapsulamento

fun main() {
    val calculadora = Calculadora(100, 5, 50)

    calculadora.primeiraParcela = 10

    calculadora.receberValorParcela(34)

    println(calculadora.primeiraParcela)


}