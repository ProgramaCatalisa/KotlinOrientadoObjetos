package poo.exemplo.objetos.moto

/**
 * Declaração da classe Moto passando os atributos
 * marca e cor sem inicializa-los no construtor primário da classe
 */
class Moto(
    var marca: String,
    var cor: String
) {

    /**
     * Declaração dos atributos no corpo da classe já sendo inicializados
     */
    var ano: Int = 0
    var proprietario: String = ""

    /**
     * Declaração da função
     */
    fun comprarMoto(precoMoto: Double){
        println("A moto foi comprada por $proprietario no valor de $precoMoto com" +
                "a cor da moto $cor de marca $marca")
    }

    /**
     * Declaração da função
     */
    fun exibirMarcaEcor() {
        println("A marca da moto é $marca e a cor é $cor")
    }

}