package com.betrybe.exercises.aula02

fun operacao(a: Int, b: Int, f: (Int, Int) -> Int) = f(a, b)

fun main() {
    // HOFs
    // let somaHof = (x, y) => x + y

    val numeros = listOf(1, 2, 3, 4, 5)
    val somaHof = { x: Int, y: Int -> x + y }
    val subtracaoHof = { x: Int, y: Int -> x - y }
    val multiplicacaoHof = { x: Int, y: Int -> x * y }
    val divisaoHof = { x: Int, y: Int -> x / y }

    println(operacao(3, 5, multiplicacaoHof))

    val numeros2 = listOf(1, 2, 3, 4, 5)
    numeros2.filter { it > 2 }.forEach { println(it) }
    println("=========")
    numeros2.filter { numero -> numero > 2 }.map { it * it }.forEach { num -> println(num) }
    println("=========")
    // under the covers
    for (it in numeros2) {
        if (it > 2) {
            println(it)
        }
    }
}