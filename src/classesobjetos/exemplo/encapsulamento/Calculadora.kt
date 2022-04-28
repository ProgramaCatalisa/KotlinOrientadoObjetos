package classesobjetos.exemplo.encapsulamento

/**
 * Exemplo de declaração de atributo com visibilidade private
 */
class Calculadora(
    primeiroNumero: Int,
    segundoNumero: Int,
    private var numero: Int
) {

    var primeiraParcela: Int = primeiroNumero
        /**
         * Exemplo de reescrita do método get() do Kotlin
         */
        get() {
            println(
                "Meu método get personalizado com o valor do field que é o " +
                        "atributo primeiraParcela no valor de $field"
            )
            return field * 2
        }

        /**
         * Exemplo de reescrita do método set(value) do Kotlin
         */
        set(value) {
            if (value >= 50) {
                field = 0
                println("Ultrapassou o limite da primeira parcela!")
            } else {
                field = value
                println("O valor do field que é o parametro primeiraParcela é de $field")
            }
        }


    /**
     * Exemplo de um atributo privado
     */
    private var segundaParcela: Int = segundoNumero

    fun receberValorParcela(valorParcela: Int) {
        if (valorParcela in 0..100) {
            segundaParcela = valorParcela
        } else {
            println("Ultrapassou o limite ou está muito abaixo")
        }
    }

    fun retornarValorParcela(): Int {
        println("Retorno do valor da segunda parcela de $segundaParcela")
        return segundaParcela
    }
}