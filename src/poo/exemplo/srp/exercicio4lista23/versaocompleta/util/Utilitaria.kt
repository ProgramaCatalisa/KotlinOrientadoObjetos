package poo.exemplo.srp.exercicio4lista23.versaocompleta.util

class Utilitaria {
    companion object Utilitaria {

        fun solicitarQtd(mensagem: String): Int {
            return try {
                println(mensagem)
                val quantidade = readln().toInt()
                validarQtd(quantidade, mensagem)
            } catch (exeception: Exception) {
                println(MSG_VALOR_INVALIDO)
                solicitarQtd(mensagem)
            }
        }

        private fun validarQtd(quantidade: Int, mensagem: String): Int {
            return if (quantidade > 0) {
                quantidade
            } else {
                println(MSG_VALOR_INVALIDO)
                solicitarQtd(mensagem)
            }
        }

        fun solicitarNome(mensagem: String): String {
            return try {
                println(mensagem)
                val nome = readln()
                nome
            } catch (exception: Exception) {
                println(MSG_VALOR_INVALIDO)
                solicitarNome(mensagem)
            }
        }

        fun adicionarItem(quantidade: Int, mensagem: String): ArrayList<String>{
            val lista = ArrayList<String>()
            for (i in 0 until quantidade) {
                val nome = solicitarNome(mensagem)
                lista.add(nome)
            }
            return lista
        }
    }
}