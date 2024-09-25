//Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e 100
// (inclusive)Faça um algoritmo que calcule e escreva a média aritmética dos números inteiros entre 15 (inclusive) e
// 100 (inclusive)

fun main() {
    // Definindo os limites
    val inicio = 15
    val fim = 100

    // Calculando a soma e a contagem dos números
    var soma = 0
    var contador = 0

    for (numero in inicio..fim) {
        soma += numero
        contador++
    }

    // Calculando a média
    val media = soma.toDouble() / contador

    // Exibindo o resultado
    println("A média aritmética dos números entre $inicio e $fim é: $media")
}
