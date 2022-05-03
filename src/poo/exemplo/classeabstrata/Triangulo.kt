package poo.exemplo.classeabstrata

class Triangulo : Poligno() {
    override fun desenhar() {
        println("Override da função desenhar na classe Triangulo!")
    }


    override fun equals(other: Any?): Boolean {
        return other == 2
    }
}