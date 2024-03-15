package com.betrybe.exercises.aula03

interface Forma2D {
    fun calcularArea(): Double
}

class Retangulo(val largura: Double, val altura: Double) : Forma2D {

    override fun calcularArea(): Double = largura * altura

}

fun main() {
    val ret = Retangulo(3.0, 5.0)
    println(ret.calcularArea())
}
