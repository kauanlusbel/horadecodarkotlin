//Escreva um programa para ler o ano de nascimento de uma pessoa e escrever uma mensagem que diga
// se ela poderá ou não votar este ano (não é necessário considerar o mês em que ela nasceu).


fun main(){
     println("Digite o ano que voce nasceu: ")
    var ano =readLine()!!.toInt()

    if (ano <= 2006) {
        println("usuario de maior idade pode votar")
    }
    else {
        println("usuario menor de idade nao  pode votar")
    }


}