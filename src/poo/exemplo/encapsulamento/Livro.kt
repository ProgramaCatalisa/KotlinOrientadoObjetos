package poo.exemplo.encapsulamento

/**
 * Exemplo de declaração de modificadores de visibilidade
 */
class Livro {
    val nome: String = "" //Visível em qualquer parte da aplicação
    internal val editora: String = "" //Visível somente dentro do módulo
    protected val ano: Int = 0 //Visível somente dentro de br.com.livraria
    private var pessoaAutora: String  = ""//Visível somente dentro de Livro.kt
}