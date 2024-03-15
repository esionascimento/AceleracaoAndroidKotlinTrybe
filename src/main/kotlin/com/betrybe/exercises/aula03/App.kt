package com.betrybe.exercises.aula02

fun main() {
    // arrays
    val num1 = arrayOf(10, 20, 30, 40, 50)
    val num2 = Array(5) { 0 }

    for (i in num1) {
        print("$i ")
    }

    println()

    for (i in 0..<num2.size) {
        print("${num2[i]} ")
    }
    println()

    // lists
    //list imutavel
    val frutas = listOf("Banana", "Maçã", "Uva")
    // frutas.add("Acerola") does not allow
    //lista mutavel
    val numeros = mutableListOf(10, 20, 30, 40, 50)
    numeros.add(100)

    for (fruta in frutas) {
        println(fruta)
    }

    // conjunto
    val frutas2Set = setOf("Banana", "Banana", "Maçã", "Uva")
    // set does not allow repeating element
    val numerosSet = mutableSetOf(1,2,3,4,5)

    for (fruta in frutas2Set) {
        print("$fruta ")
    }

    // map
    val pessoasMap = mapOf("Bruno" to 20, "Italo" to 30, "João" to 18)
    val pessoasMap2 = mutableMapOf("Bruno" to 20, "Italo" to 30, "João" to 18)

    for (pessoa in pessoasMap.entries) {
        println("${pessoa.key} tem ${pessoa.value} anos")
    }
}