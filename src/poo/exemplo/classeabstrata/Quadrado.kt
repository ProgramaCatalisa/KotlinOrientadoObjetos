package poo.exemplo.classeabstrata

class Quadrado : Poligno() {

    override fun desenhar() {
        println("Override da função desenhar na classe quadrado!")
    }

    override fun exibirNumeroLados(numeroLados: Int) {
       val somatoriaNumeroLados = numeroLados + 2
        println("A somatoria do valor dos numeros de lados: $numeroLados" +
                "pelo valor 2 da um total de $somatoriaNumeroLados")
    }

}