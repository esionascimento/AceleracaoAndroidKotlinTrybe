package com.betrybe.exercises.aula01

/*
    Escrever um programa que recaba três números inteiros,
    calcule e mostre a média aritmética simples entre os números
 */

fun main() {
    print("Digite o primeiro número: ")
    val num1: Int = readln().toInt()

    print("Digite o segundo número: ")
    val num2: Int = readln().toInt()

    print("Digite o terceiro número: ")
    val num3: Int = readln().toInt()

    val media = calcularMedia(num1, num2, num3)
    println("A média aritmetica simples é $media")
}

/*
fun calcularMedia(a: Int, b: Int, c: Int): Int {
    return ( a + b + c) / 3
}*/

fun calcularMedia(a: Int, b: Int, c: Int) = (a + b + c) / 3