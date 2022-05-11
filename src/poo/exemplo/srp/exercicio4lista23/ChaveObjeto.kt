package poo.exemplo.srp.exercicio4lista23

class ChaveObjeto(private var nome: String = "") {

    fun adicionarNome(novoNome: String) {
        this.nome = novoNome
    }

    fun exibirNome() {
        println("Objeto: $nome")
    }

    fun retornarNome(): String {
        return this.nome
    }
}