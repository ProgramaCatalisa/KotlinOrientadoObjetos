package poo.exemplo.polimorfismo.sobreposicao

class Circulo(raio: Double) : FormasGeometricas() {
    private var raio: Double = raio

    override fun calcularArea(): Double {
        return 3.14 * raio * raio
    }
}
