fun main(){
    /*Escreva um programa em que o usuário informe dois números. Então escreva em tela o maior deles.
    */
    println("digite um numero: ")
    var numero:Int= readln().toInt()


    println("Digite um numero: ")
    var numero1:Int= readln()!!.toInt()




    if (numero > numero1) {
        println("o maior numero  é o $numero: ")
    }
    else  {
        print("segundo numero é o $numero1: ")
    }




}