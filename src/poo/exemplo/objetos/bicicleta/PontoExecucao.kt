package poo.exemplo.objetos.bicicleta

/**
 * Função principal do Kotlin
 */
fun main() {
    /**
     * Declaração de objeto usando o construtor padrão
     */
    val bicicletaCaloi: Bicicleta = Bicicleta()

    /**
     * Referencia a partir do objeto bicicletaCaloi
     * os seus atributos e altera seus valores
     */
    bicicletaCaloi.marca = "Caloi"
    bicicletaCaloi.preco = 2.550
    bicicletaCaloi.cor = "verde"

    /**
     * Referencia a partir do objeto bicicletaCaloi
     * os seus atributos resgatando seus valores
     */
    println("Marca ${bicicletaCaloi.marca}")
    println("Preço ${bicicletaCaloi.preco}")
    println("Cor ${bicicletaCaloi.cor}")

    /**
     * Referencia a partir do objeto bicicletaCaloi a função
     * exibirMarcaPreco()
     */
    bicicletaCaloi.exibirMarcaEpreco()
}