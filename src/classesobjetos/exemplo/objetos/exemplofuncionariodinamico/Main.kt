package classesobjetos.exemplo.objetos.exemplofuncionariodinamico

import classesobjetos.exemplo.objetos.exemplofuncionariodinamico.Funcionario.Mensagem.exibirMensagem

fun main() {
    exibirMensagem("boas vindas do Companion Object")

    val gerenciadorFuncionario = Funcionario()

    val quantidade = gerenciadorFuncionario.solicitarQuantidadeFuncionarios()

    for (i in 1..quantidade) {
        val funcionarioCadastrado = gerenciadorFuncionario.criarFuncionario()
        gerenciadorFuncionario.inserirFuncionarioLista(funcionarioCadastrado)
    }

    gerenciadorFuncionario.exibirFuncionariosLista()

    exibirMensagem("Acabou o programa! Tchau!")
}
