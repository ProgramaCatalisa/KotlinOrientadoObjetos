package classesobjetos.exemplo.objetos.exemplofuncionariodinamico

class Funcionario(
    nomeParametro: String,
    sobrenomeParametro: String,
    horasTrabalhadasParametro: Double,
    valorPorHoraParametro: Double
) {
    var nome: String = nomeParametro
    var sobrenome: String = sobrenomeParametro
    var horasTrabalhadas: Double = horasTrabalhadasParametro
    var valorPorHora: Double = valorPorHoraParametro
    var listaFuncionarioAtributo: ArrayList<Funcionario> = ArrayList()

    fun nomeCompleto() {
        println("Olá $nome $sobrenome")
    }

    fun calcularSalario() {
        val salario = horasTrabalhadas * valorPorHora
        println("O salário é de: R$ $salario")
    }

    fun incrementarHoras(novaHora: Double) {
        horasTrabalhadas += novaHora
    }

    fun inserirFuncionarioLista(funcionario: Funcionario) {
        listaFuncionarioAtributo.add(funcionario)
    }

    fun exibirFuncionariosLista() {
        listaFuncionarioAtributo.forEach {
            it.nomeCompleto()
        }
    }

    fun solicitarQuantidadeFuncionarios(): Int{
        println("Quantos funcionários serão cadastrados? ")
        val quantidade = readln().toInt()

        return quantidade
    }

    fun criarFuncionario(): Funcionario {
        println("Digite o nome: ")
        val nomeFuncionario = readln()

        println("Digite o sobrenome: ")
        val sobrenomeFuncionario = readln()

        println("Digite quantidade de horas trabalhadas: ")
        val horasTrabalhadasFuncionario = readln().toDouble()

        println("Digite quantidade do valor hora: ")
        val valorHoraFuncionario = readln().toDouble()

        return Funcionario(
            nomeParametro = nomeFuncionario,
            sobrenomeParametro = sobrenomeFuncionario,
            horasTrabalhadasParametro = horasTrabalhadasFuncionario,
            valorPorHoraParametro = valorHoraFuncionario
        )
    }
}