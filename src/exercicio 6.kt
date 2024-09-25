//Faça um programa que receba quatro valores informados pelo usuário, mas informe somente o primeiro,
// o último e o maior de todos eles (considere que todos os números informados serão diferentes)

fun main () {
    println("Digite um numero: ")
    var num1= readLine()!!.toInt()

    println("Digite um numero: ")
    var num2= readLine()!!.toInt()

    println("Digite um numero: ")
    var num3= readLine()!!.toInt()

    println("Digite um numero: ")
    var num4= readLine()!!.toInt()



    if(num2>num1 && num2>num3 && num2>num4){
        println("segundo numero é o maior : ")
    }
    else if (num3>num1 && num3>num2 && num3>num4){
        println("terceiro numero é o maior : ")

    }
    else{println("o terceiro numero e o segundo numero nao e o maior somente o $num1 '' $num2 ") }





}