package classesobjetos.exemplo.objetos.exemplofuncionariodinamico

fun main() {
    val gerenciadorFuncionario = Funcionario(
        "",
        "",
        0.0,
        0.0
    )

    val quantidade = gerenciadorFuncionario.solicitarQuantidadeFuncionarios()

    for (i in 1..quantidade) {
        val funcionarioCadastrado = gerenciadorFuncionario.criarFuncionario()
        gerenciadorFuncionario.inserirFuncionarioLista(funcionarioCadastrado)
    }

    gerenciadorFuncionario.exibirFuncionariosLista()
}
