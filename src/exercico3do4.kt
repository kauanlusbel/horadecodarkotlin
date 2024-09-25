fun main() {
    // Cria uma lista de frutas
    val frutas = mutableListOf("Maçã", "Banana", "Laranja", "Uva", "Manga", "Abacaxi")

    // Mostra as frutas disponíveis
    println("Lista de compras:")
    for (fruta in frutas) {
        println(fruta)
    }

    // Continua até que a lista de frutas esteja vazia
    while (frutas.isNotEmpty()) {
        // Pede ao usuário para digitar o nome de uma fruta
        println("\nDigite o nome de uma fruta para remover da lista:")
        val frutaEscolhida = readLine() ?: ""

        // Verifica se a fruta está na lista
        if (frutaEscolhida in frutas) {
            // Remove a fruta da lista
            frutas.remove(frutaEscolhida)
            println("Fruta foi retirada da lista.")
        } else {
            // Se a fruta não estiver na lista, informa o usuário
            println("Fruta indisponível no nosso mercado.")
        }

        // Mostra a lista atualizada de frutas
        println("Lista atualizada:")
        for (fruta in frutas) {
            println(fruta)
        }
    }

    // Quando a lista estiver vazia, exibe a mensagem final
    println("Lista de compras finalizada.")
}
