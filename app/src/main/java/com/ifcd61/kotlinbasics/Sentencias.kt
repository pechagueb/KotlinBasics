package com.ifcd61.kotlinbasics

/**
 * Proyecto: Kotlin Basics
 * De: com.ifcd61.kotlinbasics
 * Creado por: Alumnado
 * El 16/09/2025 a las 9:41
 *
 */
fun main () {
    println("Sentencias:")
    println("Ingresa un valor numérico:")
    val x = readln().toInt()
    println("Ingresa un valor numérico:")
    val y = readln().toInt()


    println("Sentencia if else.")
    if (false)
        println("if se cumplió")

    if ( x == y)
        println("x es igual que y")
    else
        println("x es diferente de y")

    if ( x == y) {
        println("x es igual que y")
    } else if ( x > y) {
        println("x es mayor que y")
        println("otra instrucción")
    } else {
        println("x es menor que y")
    }

    println("Sentencia when:")

    println("Ingresa un nombre para consultar: ")
    val nombre = readln()
    when(nombre){
        "Juan" -> println("1.200€")
        "Luisa" -> println("2.200€")
        "Pedro" -> println("1.000€")
        "Rafael",
            "Rosa" -> println("1.300€")
        "Alex" -> {
            println("1.500€")
            println("1.200€")
        }
        "Lana" -> println("0€")
        else -> println("50€")
    }


}
