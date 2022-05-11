package poo.exemplo.srp.exercicio4lista23

fun main() {

    //TODO - refatorar o código para usar o principio de
    //TODO - responsabilidade única e os conceitos de POO
    val gerenciadorObjeto = GerenciadorObjeto()

    println("Quantos objetos voce quer adicionar? ")
    val qtdObjetos = readln().toInt()

    for (i in 1..qtdObjetos) {
        val listaCores = ArrayList<String>()

        println("Qual o nome do objeto? ")
        val nomeObjeto = readln()

        val chave: ChaveObjeto = ChaveObjeto(nomeObjeto)

        println("Quantas cores voce quer adicionar ao objeto? ")
        val qtdCores = readln().toInt()

        for (i in 0 until qtdCores) {
            println("Digite o nome da cor: ")
            val nomeCor = readln()
            listaCores.add(nomeCor)
        }

        val corObjeto = Cor(listaCores)
        gerenciadorObjeto.adicionarObjetosDicionario(chave, corObjeto)
    }

    gerenciadorObjeto.exibirObjetosDicionario()
}