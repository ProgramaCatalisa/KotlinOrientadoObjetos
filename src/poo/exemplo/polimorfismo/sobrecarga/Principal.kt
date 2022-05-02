package poo.exemplo.polimorfismo.sobrecarga

fun main() {
    var livro:Livro = Livro()
    livro.registraLivro("Catalisa")
    livro.registraLivro("Kotlin","Fundamento")
    livro.registraLivro("Java","Sciciliano",1990)
}