package poo.exemplo.polimorfismo.sobreposicao.formas

class Circulo(raio: Double) : FormasGeometricas() {
    private var raio: Double = raio

    //Mudança no corpo do método para aplicação de regra especídfica da classe filha
    override fun calcularArea(): Double {
        return 3.14 * raio * raio
    }
}
