package classesobjetos.exemplo.objetos.exemplofuncionariodinamico

fun main() {
    val funcionarioPadrao = Funcionario(
        "",
        "",
        0.0,
        0.0
    )

    val quantidade = funcionarioPadrao.solicitarQuantidadeFuncionarios()

    for (i in 1..quantidade) {
        val funcionarioCadastrado = funcionarioPadrao.criarFuncionario()
        funcionarioPadrao.inserirFuncionarioLista(funcionarioCadastrado)
    }

    funcionarioPadrao.exibirFuncionariosLista()
}
