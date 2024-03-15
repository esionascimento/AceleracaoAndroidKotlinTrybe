package com.betrybe.exercises.poo

open class Rectangle {
    open fun draw() {
        println("Desenhando um retângulo")
    }

    val borderColor: String get() = "black"
}

class FilledRectangle : Rectangle() {
    override fun draw() {
        println("Mensagem da classe interna")
        val filler = Filler()
        filler.drawAndFill()
    }

    inner class Filler {
        fun fill() {
            println("Preenchendo")
        }

        fun drawAndFill() {
            super@FilledRectangle.draw() // Realiza uma chamada a implementação draw() da classe Rectangle
            fill()
            println("Desenhando um retângulo preenchido com a cor ${super@FilledRectangle.borderColor}") // Utiliza a implementação de borderColcor de Rectangle()
        }
    }
}

fun main() {
    val fr = FilledRectangle()
    fr.draw()
}