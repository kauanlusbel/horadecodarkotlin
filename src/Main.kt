import kotlin.system.exitProcess

var saldo = 100.5 // Float
var senha = 3589
 var nome = ""
fun main() {
    println("Digite seu nome: ")
    nome = readLine()!!
    println("Olá $nome é um prazer ter você por aqui.")
    println("Diga como podemos te ajudar hoje.")
    println("")
    println("Digite 1  saldo. 2 Extrato. 3  fazer saque. 4 deposito 5 transferencia 6 sair")


    inicio()
}

fun inicio() {
    val escolha = readLine()?.toIntOrNull()



    when (escolha) {
        1 -> verSaldo()
        2 -> extrato()
        3 -> fazerSaque()
        4 -> fazerDeposito()
        5 -> transferencia()
        6 -> sair()
        else -> erro()
    }
}

fun verSaldo() {
    println("Digite a senha: ")
    var senha = readLine()?.toIntOrNull()

    if (senha == 3589) {
        println("Seu saldo atual é: $saldo")
        inicio()
    }
    else{
        println("Refaça a operação")
        inicio()
    }
}

fun fazerDeposito() {
    print("Qual o valor para depósito? ")
    val deposito = readLine()?.toFloatOrNull()

    if (deposito == null) {
        println("Por favor, informe um número válido.")
        fazerDeposito()
    } else if (deposito<= 0){
        println("Operação invalida digite um valor maior que zero ")

    }
    else {
        saldo += deposito
        verSaldo()
    }
}

fun fazerSaque() {

    print("Qual o valor para saque? ")
    val saque = readLine()?.toFloatOrNull()
    var senha2 = readLine()?.toIntOrNull()


    if (saque == null) {
        println("Por favor, informe um número válido.")
        fazerSaque()
    }
    else if (saque <= 0){
        println("Operação invalida, por favor refaça a solicitação")
        fazerSaque()
    }
    else if (saque> saldo) {
        println("Operção invalida , por favor refaça a solicitação")
        fazerSaque()
    } else {
        saldo -= saque
        verSaldo()
    }
    while (senha2!=senha)
        println("operação invalida refaça operação")
    fazerSaque()
    if (senha2 ==senha)
        println("operação realizada com sucesso!")
    inicio()

}

fun erro() {
    println("Digite 1  saldo. 2 Extrato. 3  fazer saque. 4 deposito 5 transferencia 6 sair")
    inicio()
}
fun extrato() {
    println("Digite a senha: ")
    var senha2 = readLine()?.toIntOrNull()
    while (senha2 != senha){
        println("senha invalida por favor refaça a operação")
        extrato()
        if(senha2 ==senha)
            break

        println("----------------------------")
        println("")
        println("Mercado Tia lolo ---- R$ 20,00")
        println("Sorveteria Kidelicia ---- R$ 18,00")
        println("Pastelaria---- R$ 24,00")
        println("Caldo de cana ---- R$ 11,00")
        println("")
        println("-------------------------------")
        println("saldo atual é $saldo")

        inicio()

    }

}
fun transferencia() {
    print("informe o numero da conta:  ")
    var conta = readLine()?.toIntOrNull()
    println(conta)
    println("informe o valor a ser transferido ")
    var valor = readLine()?.toInt()
    var valor1= saldo - valor!!
    if (valor1!! >=saldo ) {
        println("Operação invalida numero solicitado maior do que poderia ser feito")
        println("por favor refaça a operação")
        transferencia()
    }
    else if (valor1 < saldo){

        println(valor)
        println("valor transferido foi ${valor}")
        inicio()
    }else (conta == null){
        println("Desculpe algo deu errado ")
    }



}
fun sair() {
    print("Você deseja sair? (S/N) ")
    val confirma = readLine()?.toUpperCase()

    when (confirma) {
        "S" -> sair2()
        "N" -> inicio()
        else -> sair()


    }
}
fun sair2(){
    println("Obrigado $nome por utilizar nosso app  o jeito mais seguro para você")
}


