package poo.exemplo.srp.exercicio4lista23.versaocompleta.classes

class GerenciadorObjeto {
    private val dicionarioObjeto = mutableMapOf<ChaveObjeto, Cor>()

    fun adicionarObjetosDicionario(chave: ChaveObjeto, cores: Cor){
        this.dicionarioObjeto[chave] = cores
    }

    fun exibirObjetosDicionario(): Map<ChaveObjeto, Cor>{
        dicionarioObjeto.forEach { (chaveObjeto, cor) ->
            println("${chaveObjeto.retornarNome()} ----> ${cor.retornarCores()}")
        }
        return dicionarioObjeto
    }
}