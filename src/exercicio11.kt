// Escreva um programa em que o usuário informe 10 valores e escreva quantos desses valores lidos estão entre
// os números 24 e 42 (incluindo os valores 24 e 42) e quantos deles estão fora deste intervalo.

fun main(){
    var dentrodointervalo= 0
    var fora = 0
    for(i in 1..10) {
        println("Digite um numero: ")
        var num = readLine()!!.toDouble()
        if (num in 24.0 ..42.0) {
            dentrodointervalo++
        }
        else { fora++ }

    }
    println("numeros que estao dentro  $dentrodointervalo")
    println("numero que estao fora da lista  $fora")

}