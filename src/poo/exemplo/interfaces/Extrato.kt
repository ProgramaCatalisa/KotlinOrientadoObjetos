package poo.exemplo.interfaces

class Extrato {
    fun exibirExtrato(conta: Conta){
        println("Valor na conta é de ${conta.saldo}")
    }
}