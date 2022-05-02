package poo.exemplo.polimorfismo.sobreposicao.formas

class Quadrado(val lado:Double): FormasGeometricas() {

    //Mudança no corpo do método para aplicação de regra especídfica da classe filha
    override fun calcularArea():Double{
        return lado*lado
    }
}