package com.betrybe.exercises.aula04

data class User(
    var name: String,
)

data class User2(
    var name: String,
    val age:Int
)

fun main() {
    val silva = User("Nascimento Silva")
    // Getter
    println(silva.name)
    // Setter
    silva.name = "João"
    println(silva)

    val maria = User2("Maria silva", 30)
    // Getter
    println(maria.name)
    println(maria)
}