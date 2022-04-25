package classesobjetos.exemplo.objetos.carro

/**
 * Declaração da classe Carro passando os parametros
 * valorCarro e proprietario no construtor primário da classe
 */
class Carro(valorCarro: Double, proprietario: String) {

    /**
     * Declaração dos atributos da classe e suas respectivas
     * inicializações
     */
    var cor: String = "preto"
    var modelo: String = "Honda"
    var consumo: Double? = null
    var nomeProprietario = proprietario
    var valorCarroAtributo = valorCarro

    /**
     * Declaração dos méodos da classe
     */
    fun exibirModelo(modeloCarro: String) {
        println("O modelo é $modeloCarro")
    }

    fun venderCarro() {
        println("O carro será vendido por $valorCarroAtributo")
    }

    fun correr() {
        println("Carro está correndo...")
    }

    fun parar() {
        println("O carro está parando...")
    }
}