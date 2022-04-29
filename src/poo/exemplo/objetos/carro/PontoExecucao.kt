package poo.exemplo.objetos.carro

/**
 * Função principal do Kotlin
 */
fun main() {
    /**
     * Declaração de um objeto do tipo Carro passando
     * os valores valorCarro e proprietario na criação do objeto
     */
    val hondaCivic: Carro = Carro(35.500, "Jessica")

    /**
     * Referenciando o atributo cor através do objeto hondaCivic
     * e alterando o valor do atributo cor para preto
     */
    hondaCivic.cor = "preto"

    /**
     * Referenciando a função correr através do objeto hondaCivic
     */
    hondaCivic.correr()

    /**
     * Resgata o valor do atributo valorCarroAtributo através do objeto
     * hondaCivic para concatenar com a mensagem
     */
    println("Valor honda civic - ${hondaCivic.valorCarroAtributo}")

    /**
     * Resgata o valor do atributo nomeProprietario através do objeto
     * hondaCivic para concatenar com a mensagem
     */
    println("Proprietario honda civic - ${hondaCivic.nomeProprietario}")

    /**
     * Referenciando a função exibirModelo através do objeto hondaCivic
     * e passando no parametro o valor Sedan
     */
    hondaCivic.exibirModelo("Sedan")


    /**
     * Declaração de um objeto do tipo Carro passando
     * os valores valorCarro e proprietario na criação do objeto
     */
    val porche: Carro = Carro(200.800, "Carol")


    /**
     * Referenciando o atributo modelo através do objeto porche
     * e alterando o valor do atributo modelo para Esportivo
     */
    porche.modelo = "Esportivo"

    /**
     * Referenciando o atributo cor através do objeto porche
     * e alterando o valor do atributo cor para vermelho
     */
    porche.cor = "vermelho"

    /**
     * Referenciando a função correr através do objeto porche
     */
    porche.correr()

    /**
     * Resgata o valor do atributo modelo através do objeto
     * porche para concatenar com a mensagem
     */
    println("O Proche tem o modelo: ${porche.modelo}")

}