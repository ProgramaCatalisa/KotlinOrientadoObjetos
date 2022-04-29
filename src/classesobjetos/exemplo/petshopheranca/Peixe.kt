package classesobjetos.exemplo.petshopheranca

import classesobjetos.exemplo.petshopheranca.Animal
import classesobjetos.exemplo.petshopheranca.PessoaTutora

class Peixe(nomeAnimal: String, especie: String,
            tipoAlimentacao: String,
            cor: String,
            tamanho: String,
            idade: Int,
            peso: Double,
            pessoaTutora: PessoaTutora,
            tipoDeAgua: String) : Animal(nomeAnimal,
        especie,
        tipoAlimentacao,
        cor,
        tamanho,
        idade,
        peso, pessoaTutora) {

    fun gloob() {
        comunicar()
    }

    fun cadastrarPeixe() {
        cadastrarAnimal()
    }
}