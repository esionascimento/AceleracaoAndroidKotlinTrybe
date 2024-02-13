package com.betrybe.exercises.kotlinBasico

/*
Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante
e mostre a média aritmética e a mensagem de acordo com as regras a seguir:
Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO
 */

fun main() {
    println("Digite a primeira nota:")
    val nota1 = readLine()!!.toDouble()

    println("Digite a segunda nota:")
    val nota2 = readLine()!!.toDouble()

    println("Digite a terceira nota:")
    val nota3 = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3) / 3

    val msg = when {
        media >= 0.0 && media < 3.0 -> "REPROVADO"
        media >= 3.0 && media < 7.0 -> "EXAME"
        media >= 7.0 && media < 10.0 -> "APROVADO"
        else -> "Média inválida"
    }

    println("A media: ${String.format("%.2f", media)}")
    println("Estudante está $msg")
}
