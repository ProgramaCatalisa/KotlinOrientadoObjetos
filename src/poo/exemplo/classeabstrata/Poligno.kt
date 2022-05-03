package poo.exemplo.classeabstrata

abstract class Poligno {
    abstract fun desenhar()

    open fun exibirNumeroLados(numeroLados: Int){
        println("A quantidade de lados é $numeroLados")
    }
}