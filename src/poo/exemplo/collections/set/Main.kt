package poo.exemplo.collections.set

fun main() {
    val conjuntoNumerosA = setOf(2, 4, 6 ,8, 8)
    println(conjuntoNumerosA)
    println("O conjuntoNumerosA possui o tamanho de: ${conjuntoNumerosA.size}")

    if (conjuntoNumerosA.contains(20)){
        println("O valor 6 está contindo no conjuntoNumerosA")
    }else{
        println("Elemento nao encontrado!")
    }

    val conjuntoNumerosB = setOf(8, 4, 6, 2, 1)
    println("O conjuntoNumerosB possui o tamanho de: ${conjuntoNumerosB.size}")

    if (conjuntoNumerosA == conjuntoNumerosB){
        println("Os conjuntos são iguais = " +
                "$conjuntoNumerosA ==  $conjuntoNumerosB ")
    }else{
        println("Os conjuntos são diferentes = " +
                "$conjuntoNumerosA !=  $conjuntoNumerosB ")
    }
}