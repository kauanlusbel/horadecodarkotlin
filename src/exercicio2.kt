import kotlin.concurrent.thread

//- Crie uma bomba relógio (usando somente código - para deixar claro!)
// cuja contagem regressiva vá de 30 a 0. No final da repetição escreva "EXPLOSÃO".

fun main (){
  for (i in 30 downTo 0) {
      println("Contagem: $i")
      Thread.sleep(1000) // Pausa de 1 segundo entre as contagens
  }
    println("Explosao")


}