package poo.exemplo.heranca

class Gato(nomeAnimal: String,
           especie: String,
           tipoAlimentacao: String,
           cor: String,
           tamanho: String,
           idade: Int, peso: Double, pessoaTutora: PessoaTutora, pelagem: String) : Animal(nomeAnimal,
        especie,
        tipoAlimentacao, cor, tamanho, idade, peso, pessoaTutora) {

    fun miar() {
        comunicar()
    }

    fun comer() {
        alimentar()
    }

    fun desfilar() {
        locomover()
    }

    fun cadastrarGato() {
        cadastrarAnimal()
    }
}