package com.betrybe.exercises.aula03

interface Forma2D2 {
    val area: Double
}

class Retangulo2(val largura: Double, val altura: Double) : Forma2D2 {

    override val area: Double
        get() = largura * altura
}

fun main() {
    val ret = Retangulo2(3.0, 5.0)
    println(ret.area)
}
