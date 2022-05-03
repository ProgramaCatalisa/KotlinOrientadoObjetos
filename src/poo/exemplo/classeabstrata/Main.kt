package poo.exemplo.classeabstrata

fun main() {
   val quadradoJessica = Quadrado()

    quadradoJessica.desenhar()
    quadradoJessica.exibirNumeroLados(4)

    val trianguloJessica = Triangulo()

    val resultadoEquals = trianguloJessica.equals(3)
    println("O resultado da sobrescrita do " +
            "meu método esqual é: $resultadoEquals")
}