fun main() {
    // Cria um array com os nomes dos planetas
    val planetas = arrayOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")

    // Pede ao usuário para digitar o nome de um planeta
    println("Digite o nome de um planeta:")
    val planetaInformado = readLine() ?: ""

    // Verifica se o planeta informado está no array
    if (planetas.contains(planetaInformado)) {
        println("O planeta $planetaInformado está na lista.")
    } else {
        println("O planeta $planetaInformado NÃO está na lista.")
    }
}
