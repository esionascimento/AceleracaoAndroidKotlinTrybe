package com.betrybe.exercises.poo
//interface ControleRemoto {
//    fun ligar()
//    fun desligar()
//}
//
//class ControleRemotoImpl : ControleRemoto {
//    override fun ligar() {
//        println("Ligando a luz")
//    }
//
//    override fun desligar() {
//        println("Desligando a luz")
//    }
//}
//
//class Luz(private val controleRemoto: ControleRemoto) : ControleRemoto by controleRemoto
//
//fun main() {
//    val controleRemoto = ControleRemotoImpl()
//    val luz = Luz(controleRemoto)
//
//    luz.ligar()    // Delega para ControleRemotoImpl
//    luz.desligar() // Delega para ControleRemotoImpl
//}

val minhaPropriedade by lazy {
    println("Inicializando a propriedade")
    "Valor inicial"
}

fun main() {
    println("Antes da primeira chamada")
    println(minhaPropriedade) // Inicializa a propriedade aqui
    println("Depois da primeira chamada")
    println(minhaPropriedade) // Não precisa reinicializar, apenas retorna o valor armazenado
}