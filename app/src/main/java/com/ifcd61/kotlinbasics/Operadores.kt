package com.ifcd61.kotlinbasics

/**
 * Proyecto: Kotlin Basics
 * De: com.ifcd61.kotlinbasics
 * Creado por: Alumnado
 * El 16/09/2025 a las 9:05
 *
 */

fun main() {
    println("Operadores matemáticos:")
    println("Ingresa un valor numérico:")
    val x = readln()
    println("Ingresa un valor numérico:")
    val y = readln()

    println("$x $y")
    println("x + y = ${x.toInt() + y.toInt()}")
    println("x - y = ${x.toInt() - y.toInt()}")
    println("x * y = ${x.toInt() * y.toInt()}")
    println("x / y = ${x.toInt() / y.toInt()}")
    println("x % y = ${x.toInt() % y.toInt()}")


    println("Operadores de incremento")

    var numX = x.toInt()
    var numY = y.toInt()

    numX++ //numX = numX + 1
    numY-- //numY = numY - 1

    println("x + 1 $numX")
    println("y - 1 $numY")

    numX += 11
    println("x + 11 = $numX")
    numY /= 2
    println("y / 2 = $numY")

    println("Operadores de igualdad.")
    var esIgual: Boolean = (x.toInt() == 2) //False
    esIgual = (x.toInt() != 2)

    println("Operadores lógicos")
    val or = (1 == 1 || 2 == 5)
    /*
     * OR
     * true o true = true
     * true o false = true
     * false o true = true
     * false o false = false
     */

    val and = (1 == 1 && 2 == 5)
    /*
     * AND
     * true o true = true
     * true o false = false
     * false o true = false
     * false o false = false
     */

    println("Operadores comparativos")
    val mayorQue = (7 > 3)//true
    val menorQue = (5 < 10)//true
    println("Mayor que: $mayorQue")
    println("Menor que: $menorQue")

    val mayoroIgualQue = (7 >= 3)//true
    val menoroIgualQue = (5 <= 10)//true
    println("Mayor o igual que: ${mayoroIgualQue}")
    println("Menor o igual que: $menoroIgualQue")







}