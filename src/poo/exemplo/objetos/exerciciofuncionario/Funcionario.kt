package poo.exemplo.objetos.exerciciofuncionario

class Funcionario {
    var nome: String = ""
    var sobrenome: String = ""
    var horasTrabalhadas: Double = 0.0
    var valorPorHora: Double = 0.0

    fun nomeCompleto(){
        println("Olá $nome $sobrenome")
    }

    fun calcularSalario(){
        val salario = horasTrabalhadas * valorPorHora
        println("O salário é de: R$ $salario")
    }

    fun incrementarHoras(novaHora: Double){
        horasTrabalhadas += novaHora
    }
}