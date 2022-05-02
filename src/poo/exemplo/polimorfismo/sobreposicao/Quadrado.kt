package poo.exemplo.polimorfismo.sobreposicao

class Quadrado(val lado:Double): FormasGeometricas() {

    override fun calcularArea():Double{
        return lado*lado
    }
}