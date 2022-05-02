package poo.exemplo.polimorfismo.sobrecarga

class Livro() {

    fun registraLivro(nomeLivro: String) {
        println("O livro registrado se chama $nomeLivro")
    }

    fun registraLivro(nomeLivro: String, editora: String) {
        println("O livro registrado se chama $nomeLivro e é da editora $editora")
    }

    fun registraLivro(nomeLivro: String, editora: String, ano: Int) {
        println("O livro registrado se chama $nomeLivro, é da editora $editora e é do ano $ano")
    }
}
