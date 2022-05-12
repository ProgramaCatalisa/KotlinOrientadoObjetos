package poo.exemplo.srp.exercicio4lista23.versaocompleta

import poo.exemplo.srp.exercicio4lista23.versaocompleta.classes.ChaveObjeto
import poo.exemplo.srp.exercicio4lista23.versaocompleta.classes.Cor
import poo.exemplo.srp.exercicio4lista23.versaocompleta.classes.GerenciadorObjeto
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.MSG_INSERCAO_NOME_COR
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.MSG_INSERCAO_NOME_OBJETO
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.MSG_QUANTIDADE_CORES
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.MSG_QUANTIDADE_OBJETO
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.Utilitaria.Utilitaria.adicionarItem
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.Utilitaria.Utilitaria.solicitarNome
import poo.exemplo.srp.exercicio4lista23.versaocompleta.util.Utilitaria.Utilitaria.solicitarQtd

fun main() {
    val gerenciadorObjeto = GerenciadorObjeto()
    val qtdObjetos = solicitarQtd(MSG_QUANTIDADE_OBJETO)

    for (i in 1..qtdObjetos) {
        val nomeObjeto = solicitarNome(MSG_INSERCAO_NOME_OBJETO)
        val chave = ChaveObjeto(nomeObjeto)
        val qtdCores = solicitarQtd(MSG_QUANTIDADE_CORES)
        val corObjeto = Cor(adicionarItem(qtdCores, MSG_INSERCAO_NOME_COR))
        gerenciadorObjeto.adicionarObjetosDicionario(chave, corObjeto)
    }
    gerenciadorObjeto.exibirObjetosDicionario()
}