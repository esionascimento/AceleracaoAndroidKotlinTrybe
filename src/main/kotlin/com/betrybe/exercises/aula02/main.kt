package com.betrybe.exercises.aula02

/*
    Escrever um programa em Kotlin que preencha dois arrays de dez elementos
    numéricos cada um e mostre o array resultante da intercalação deles.
 */

fun main() {
    // list
    val array1 = mutableListOf<Int>()
    // array
    val array2 = Array(10) { 0 }
    val arrayResultante = Array(20) { 0 }

    for (i in 0 ..< 10) {
        print("Digite o valor do indice $i do array1: ")
        array1.add(readln().toInt())
    }
    for (i in array2.indices) {
        print("Digite o valor do indice $i do array2: ")
        array2[i] = readln().toInt()
    }

    var array1Index = 0
    var array2Index = 0
    for (i in arrayResultante.indices) {
        if (i % 2 == 0) {
            arrayResultante[i] = array1[array1Index]
            array1Index++
        } else {
            arrayResultante[i] = array2[array2Index]
            array2Index++
        }
    }

    array1.forEach { print("$it ")}
    println()
    array2.forEach { print("$it ")}
    println()
    arrayResultante.forEach { print("$it ")}
}
