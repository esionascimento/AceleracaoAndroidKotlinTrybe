package com.betrybe.exercises.aula04

interface OnClickListener {
    fun onClick()
}

//class Main: OnClickListener {
//    init {
//        button.setOnClickListaner(object: OnClickListener {
//            override fun onClick() {
//                TODO("Not yet implemented")
//            }
//        })
//    }
//    override fun onClick() {
//        TODO("Not yet implemented")
//    }
//}
class Bruno
object DBConn {
    var instance: Bruno? = null
    fun init(): Bruno {
        if (instance == null) {
            instance = Bruno()
        }
        return instance!!
    }

    fun foo() {
        println("bar")
    }
}

enum class DiasDaSemana {
    SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
}

enum class Cores(val hex: String) {
    VERMELHO("#FF0000"),
    VERDE("#00FF00"),
    AZUL("#0000FF"),
    BRANCO("#FFFFFF"),
    PRETO("#000000")
}

fun imprimirNomeDia(nome: DiasDaSemana) {
    println(nome)
}

fun main() {
    println(DBConn.init())
    println(DBConn.init())

    println(Cores.VERMELHO.hex)
    imprimirNomeDia(DiasDaSemana.SEGUNDA)
}