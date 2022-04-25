package classesobjetos.exemplo.objetos.bicicleta

/**
 * Declaração da classe Bicicleta
 */
class Bicicleta {
    /**
     * Declaração dos atributos e suas inicializações
     */
    var marca: String = ""
    var preco: Double = 0.0
    var cor: String = ""


    /**
     * Declaração de método da classe
     */
    fun exibirMarcaEpreco() {
        println("O modelo é $marca e o valor é $preco")
    }
}