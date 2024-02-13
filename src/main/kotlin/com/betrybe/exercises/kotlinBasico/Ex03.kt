package com.betrybe.exercises.kotlinBasico

/*
Escrevas um programa em Kotlin que receba dois números e mostre o maior.
 */

fun main() {
    print("Digite numero 1: ")
    val n1: Double = readln().toDouble()

    print("Digite numero 2: ")
    val n2: Double = readln().toDouble()

    println("O maior número é ${maxOf(n1, n2)}")
}
