/*
Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.
 */
 fun main(){
     println("digite um numero: ")
    var num1 = readLine()!!.toInt()



    if(num1 >0 ) {
        print("numero positivo")
    }
    else if (num1 < 0){
        print("numero negativo")
    }
    else if (num1 ==0) {
        println(" é zero! ")
    }
 }

