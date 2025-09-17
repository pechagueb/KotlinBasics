package com.ifcd61.kotlinbasics

/**
 * Proyecto: Kotlin Basics
 * De: com.ifcd61.kotlinbasics
 * Creado por: Alumnado
 * El 12/09/2025 a las 13:03
 *
 */

fun main() {
    println("booleans")
    val esVerdadero: Boolean = true
    println(esVerdadero)


    println("números enteros")
    val paises: Int = 120
    print("Paises: ")
    println(paises)

    println("Long")
    val milisegundos: Long = 21_474_545_471L
    print("Milisegundos: ")
    println(milisegundos)

    println("Numeros decimales: ")
    val euros: Float = 20.58f
    print("Saldo: ")
    println(euros)


    val diametroLunar: Double = 2.56_666_666_666
    print("Diámetro lunar: ")
    println(diametroLunar)
    println("Max Double " + Double.MAX_VALUE)
    println("Min Double " +Double.MIN_VALUE)
    println("Max Float " +Float.MAX_VALUE)
    println("Min Float " +Float.MIN_VALUE)

    println("Textos")
    val letra1: Char = 'M'
    val letra2: Char = 'A'
    val letra3: Char = 'Y'
    val letra4: Char = 'O'

    print(letra1)
    print(letra2)
    print(letra3)
    print(letra4)

    val nombre: String = "Rafael"
    println(nombre)

    val casosEspeciales: String = "El curso de Kotlin \n"
    print(casosEspeciales)
    print("Salto de linea")

    println("Concatenación")
    val nombre1 = readln()
    println(nombre1)

    println("hola " + nombre1)
    println("hola $nombre1")


    println("Nulos:")
    var sobrenombre: String? = null
    sobrenombre = "Al"
    println("longitud del sobrenombre: ${sobrenombre.length}")


    println("Operador Elvis:")
    var version: Int? = 3
    version = null
    version = 6
    println("La version actual es: ${version ?: 5}")







}