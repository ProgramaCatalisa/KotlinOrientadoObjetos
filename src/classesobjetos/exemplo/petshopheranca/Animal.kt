package classesobjetos.exemplo.petshopheranca

open class Animal(val nomeAnimal: String, val especie: String, val tipoAlimentacao: String,
                  val cor: String, val tamanho: String,
                  val idade: Int, val peso: Double, val pessoaTutora: PessoaTutora) {

    protected fun comunicar() {
        println("Estou me comunicando")
    }

    protected fun locomover() {
        print("Estou me locomovendo")
    }

    protected fun alimentar() {
        print("Estou comendo...")
    }

    protected fun cadastrarAnimal() {
        println("Iniciando cadastro")
        println("Nome do animal: $nomeAnimal")
        println("Nome da pessoa tutora: ${pessoaTutora.nome}")
        println("O animal é da espécie: $especie")
        println("O animal pesa: $peso kg")
        println("A idade do animal é: $idade anos")
        println("Cadastro concluído com sucesso")
    }
}