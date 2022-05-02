package poo.exemplo.polimorfismo.sobreposicao.calculadoras

open class Calculadora {
    open fun somar(x: Int, y: Int): Int {
        return x + y
    }
}