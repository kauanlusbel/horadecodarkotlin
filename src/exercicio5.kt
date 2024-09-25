//Faça um algoritmo que calcule e escreva a média aritmética dos dois números inteiros informados
// pelo usuário e todos os números inteiros entre eles. Considere que o primeiro sempre será menor que o segundo.

fun main(){
    var soma= 0
    var contador = 0

    println("digite um numero: ")
    var num1 = readLine()!!.toInt()


    println("Digite um numero: ")
    var num2 = readLine()!!.toInt()

    for(i in num1 .. num2){
        soma += i
        contador++
    }
    val media = soma.toDouble() / contador
    println("media = $media")
}