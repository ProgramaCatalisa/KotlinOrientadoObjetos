package poo.exemplo.polimorfismo.sobreposicao.calculadoras

class CalculadoraCientifica : Calculadora() {

    //Quando queremos utilizar o mesmo método da classe mãe, sem aplicar regra específica
    override fun somar(x: Int, y: Int): Int {
        return super.somar(x, y)
    }
}