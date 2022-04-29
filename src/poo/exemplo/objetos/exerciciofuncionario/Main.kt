package poo.exemplo.objetos.exerciciofuncionario

fun main() {
    val novoFuncionario: Funcionario = Funcionario()

    novoFuncionario.nome = "Luis"
    novoFuncionario.sobrenome = "Santos"
    novoFuncionario.horasTrabalhadas = 10.0
    novoFuncionario.valorPorHora = 25.50

    novoFuncionario.nomeCompleto()
    novoFuncionario.calcularSalario()
    novoFuncionario.incrementarHoras(8.0)
    novoFuncionario.calcularSalario()

    val listaFuncionarios = ArrayList<Funcionario>()

    val funcionarioCarol: Funcionario = Funcionario()
    funcionarioCarol.nome = "Carol"
    funcionarioCarol.sobrenome = "Fonseca"
    listaFuncionarios.add(funcionarioCarol)

    val funcionarioJessica: Funcionario = Funcionario()
    funcionarioJessica.nome = "Jessica"
    funcionarioJessica.sobrenome = "Santos"
    listaFuncionarios.add(funcionarioJessica)

    val funcionarioThayana: Funcionario = Funcionario()
    funcionarioThayana.nome = "Thayana"
    funcionarioThayana.sobrenome = "Gayva"
    listaFuncionarios.add(funcionarioThayana)

    listaFuncionarios.forEach { funcionario ->
        funcionario.valorPorHora = 50.0
        funcionario.horasTrabalhadas = 40.0
        funcionario.nomeCompleto()
        funcionario.calcularSalario()
    }


}