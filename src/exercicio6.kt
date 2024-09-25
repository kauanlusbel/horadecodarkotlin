//Escreva um programa para ler 2 notas de um aluno, calcular e imprimir a média final. Considere que a nota de
// aprovação é 9,5. Logo após escrever a mensagem "Calcular a média de outro aluno Sim/Não?" e solicitar um resposta.
// Se a resposta for "S", o programa deve ser executado novamente, caso contrário deve ser encerrado exibindo a quantidade
// de alunos aprovados.
import kotlin.system.exitProcess
var list_a= mutableListOf<String>()
var list_b=mutableListOf<String>()
fun main(){
    println("Deseja ver media")
    println("digite 1 para sim 2 para não")
    var confirme = readLine()!!.toInt()
    when (confirme) {
        1 -> media()
        2-> fechamento2()

    }
}
fun media(){

    println("Digite o nome do aluno: ")
    var nome = readLine()!!
    println("Digite um nota: ")
    var num1 = readLine()!!.toInt()

    println("Digite outro nota: ")
    var num2 = readLine()!!.toInt()

    var media= (num1+num2) / 2
    if (media < 9.5){
        println("Aluno reprovado!")
        list_b.add(nome)
    }
    else if (media >= 9.5){
        println("Aluno Aprovado!")
        list_a.add(nome)


    }
    println("Deseja ver outra  media")
    println("digite 1 para sim 2 para não")
    var confirme = readLine()!!.toInt()
    when (confirme) {
        1 -> media()
        2 -> fechamento()

    }

}
fun fechamento (){
    println("alunos nao aprovado"+list_a.count())



}
fun fechamento2(){
    println("OK! , OBRIGADO")
}