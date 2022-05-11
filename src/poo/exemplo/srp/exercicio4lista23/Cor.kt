package poo.exemplo.srp.exercicio4lista23

class Cor(private val listaCores: ArrayList<String>) {

    fun adicionarCor(cor: String) {
        this.listaCores.add(cor)
    }

    fun exibirCores() {
        this.listaCores.forEach {
            println("Cor: $it")
        }
    }

    fun retornarCores(): List<String> {
        return this.listaCores
    }
}