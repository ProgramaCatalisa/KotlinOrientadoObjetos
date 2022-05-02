package poo.exemplo.polimorfismo.sobreposicao.formas

fun main() {
    val circulo: FormasGeometricas = Circulo(2.0)
    val area: Double = circulo.calcularArea()
    println(area)

    val quadrado: FormasGeometricas = Quadrado(2.0)
    val areaQuadrado: Double = quadrado.calcularArea()
    println(areaQuadrado)

    print("Escolha a forma geométrica desejada: (C) círculo e (Q) quadrado:")
    val opcao: String = readln()
    var forma: FormasGeometricas = FormasGeometricas();
    print("Digite o raio ou o lado para calcular a área: ")
    val comprimento: Double = readln().toDouble()

    if (opcao == "C") {
        forma = Circulo(comprimento)
    } else {
        forma = Quadrado(comprimento)
    }
    val areaForma = forma.calcularArea()
    println("A forma tem área total de: $areaForma")
}