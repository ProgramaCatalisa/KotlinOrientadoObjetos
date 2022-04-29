package poo.exemplo.objetos.exemplofuncionariodinamico

import poo.exemplo.objetos.exemplofuncionariodinamico.Funcionario.Mensagem.exibirMensagem

const val CONSTANTE_NUMERO_UM = 1

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
