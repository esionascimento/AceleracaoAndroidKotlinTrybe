package com.betrybe.exercises.aula03

abstract class Animal {
    abstract val raca: String
    abstract fun comer()
}

class Coelho : Animal() {
    override val raca: String
        get() = TODO("Not yet implemented")

    override fun comer() {
        TODO("Not yet implemented")
    }
}

class Pessoa(val nome: String, val idade: Int, val email: String = "") {
    fun imprimirNome(mensagem: String = "Olá") {
        println("$mensagem $nome")
    }
}

fun main() {
    val silva = Pessoa("Nascimento Silva", 20)

    println("Nome: ${silva.nome}")
    println("Idade: ${silva.idade}")
    println("Email: ${silva.email}")

    silva.imprimirNome()
    silva.imprimirNome("Fala")
}