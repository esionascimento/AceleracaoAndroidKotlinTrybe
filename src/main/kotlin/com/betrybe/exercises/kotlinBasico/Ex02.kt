package com.betrybe.exercises.kotlinBasico

/*
Cada degrau de uma escada tem X de altura.
Escreva um programa usando Kotlin que receba essa altura
e a altura que uma pessoa deseja alcançar usando a escada,
calcule e mostro quantos degraus ela deverá subir para atingir seu objetivo,
sem se preocupar com a altura da pessoa.
Todas as medidas fornecidas devem estar em metros.
 */

fun main() {
    print("Digite a altura da escada: ")
    val heightEscada: Double = readln().toDouble()

    print("Digite a altura que deseja subir: ")
    val heightSubir: Double = readln().toDouble()

    val somaDegraus = (heightSubir / heightEscada).toInt()

    println("Deverá ter $somaDegraus degraus")
}
