package poo.exemplo.objetos.exemplofuncionariodinamico

class Funcionario(
    nomeParametro: String = "",
    sobrenomeParametro: String = "",
    horasTrabalhadasParametro: Double = 0.0,
    valorPorHoraParametro: Double = 0.0
) {
    var nome: String = nomeParametro
    var sobrenome: String = sobrenomeParametro
    var horasTrabalhadas: Double = horasTrabalhadasParametro
    var valorPorHora: Double = valorPorHoraParametro
    var listaFuncionarioAtributo: ArrayList<Funcionario> = ArrayList()

    init {
        if (valorPorHoraParametro >= 100.0){
            valorPorHora = 100.0
            println("Ta ganhando bem!!! O valor por hora é $valorPorHora")
        }else{
            valorPorHora = valorPorHoraParametro
            println("Valor ok!!! o valor é $valorPorHora")
        }
    }

    fun nomeCompleto() {
        println("Dados funcionário - Nome: $nome $sobrenome")
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
        println("------- LISTA DE FUNCIONÁRIOS ------")
        listaFuncionarioAtributo.forEach {
            it.nomeCompleto()
        }
    }

    fun solicitarQuantidadeFuncionarios(): Int{
        println("------- QUANTIDADE DE FUNCIONÁRIOS ------")
        println("Quantos funcionários serão cadastrados? ")
        val quantidade = readln().toInt()

        return quantidade
    }

    fun criarFuncionario(): Funcionario {
        println("------- CADASTRO DE FUNCIONÁRIOS ------")
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

    companion object Mensagem{
        fun exibirMensagem(texto: String){
            println(texto)
            CONSTANTE_NUMERO_UM
        }
    }
}