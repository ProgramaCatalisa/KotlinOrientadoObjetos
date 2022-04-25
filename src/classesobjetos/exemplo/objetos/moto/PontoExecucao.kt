package classesobjetos.exemplo.objetos.moto

/**
* Função principal do Kotlin
*/
fun main() {
    /**
     * Solicitação de dados para o usuário
     */
    println("Digite a marca de uma moto: ")
    val marcaMoto = readln()

    println("Digite a cor da sua moto: ")
    val corMoto = readln()


    /**
     * Declaração de um objeto do tipo Moto passando
     * os valores marca e cor a partir dos dados
     * digitados pelo usuários na criação do objeto
     */
    val motoUsuario: Moto = Moto(marcaMoto, corMoto)

    /**
     * Solicitação de dados para o usuário
     */
    println("Digite o nome do proprietario: ")

    /**
     * Adiciona para dentro do atributo proprietario
     * o valor digitado pelo usuário
     */
    motoUsuario.proprietario = readln()


    /**
     * Solicitação de dados para o usuário
     */
    println("Digite o ano da moto: ")

    /**
     * Adiciona para dentro do atributo ano
     * o valor digitado pelo usuário
     */
    motoUsuario.ano = readln().toInt()


    /**
     * Solicitação de dados para o usuário
     */
    println("Digite o preço da moto: ")

    /**
     * Adiciona para uma variavel preco da moto
     * digitado pelo usuário
     */
    val precoMoto = readln().toDouble()

    /**
     * Referencia a partir do objeto motoUsuario a função
     * comprarMoto passando como valor do parametro a
     * variável precoMoto
     */
    motoUsuario.comprarMoto(precoMoto)


    /**
     * Exemplo de criação de um array do tipo Moto
     */
    val listaMotos = ArrayList<Moto>()

    /**
     * Adiciona para dentro do array um objeto do tipo Moto
     */
    listaMotos.add(motoUsuario)

    /**
     * Percorre o array do tipo Moto exibindo a marca de
     * cada objeto do tipo Moto do ArrayList<Moto>
     */
    listaMotos.forEach { moto ->
        println(moto.marca)
    }
}