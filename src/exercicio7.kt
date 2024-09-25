//Escreva um algoritmo para ler as notas de avaliações de um aluno, calcule e imprima a média (simples) desse aluno.
// Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada nota. São 6 notas ao total.
//Caso o valor informado para qualquer uma das notas esteja fora do limite estabelecido, deve ser solicitado um novo valor
//
// ao usuário.


fun main() {
    var soma = 0.0

    for (i in 1..6) {
        var nota: Double

        while (true) {
            println("Digite a nota $i (de 0 a 10):")
            nota = readLine()?.toDoubleOrNull() ?: -1.0

            if (nota in 0.0..10.0) {
                break
            } else {
                println("Nota inválida! Tente novamente.")
            }
        }

        soma += nota
    }

    val media = soma / 6
    println("A média das notas do aluno é: $media")
}






