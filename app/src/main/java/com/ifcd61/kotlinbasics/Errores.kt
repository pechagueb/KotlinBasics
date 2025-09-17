package com.ifcd61.kotlinbasics

/**
 * Proyecto: Kotlin Basics
 * De: com.ifcd61.kotlinbasics
 * Creado por: Alumnado
 * El 16/09/2025 a las 11:22
 *
 */

fun main() {
    println("throw")
    val ex = "Lucy"
    val nombre = readln()
    try {
        if (nombre == ex){
            throw Exception("La que no debe ser nombrada :(")
        } else {
            println("Claro que conozco a $nombre :)")
        }
    } catch (e: Exception){
        println(e)
    } finally {
        println("Que bueno que ya se fue tu amigo")
    }

    println("Try, catch, finally")
    println("Continua el programa...")
}