package com.betrybe.kotlinBasico

/*
Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%
 */

fun main() {
    print("Digite o salário: ")
    val salario: Double = readln().toDouble()

    val aumento = calcularAumento(salario)

    println("A média aritmetica simples é $aumento")
}

fun calcularAumento(a: Double) = a + (a * 0.25)