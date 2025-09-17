package com.ifcd61.kotlinbasics

/**
 * Proyecto: Kotlin Basics
 * De: com.ifcd61.kotlinbasics
 * Creado por: Alumnado
 * El 16/09/2025 a las 10:56
 *
 */

fun main(){
    println("Bucles")
    println("For:")

    for (i in 1..3){
        println(i)
    }

    val nombre = "Rafael"
    for (i in 0.. nombre.length - 1){
        println("Indice $i = ${nombre[i]}")
    }

    for (letra in nombre){
        println(letra)
    }

    nombre.forEach {
        println(it)
    }

    println("While y Do While")

    var indice = 0
    while (indice < nombre.length){
        println("Indice: $indice = ${nombre[indice]}")
        indice++
    }

    do {
        indice--
        println("Indice: $indice = ${nombre[indice]}")

    } while (indice > 0)


    println("retur, break y continue")

    for (i in 0..4){
        if ( i == 2)
            break
        println("indice $i")
    }

    for (i in 0..4){
        if ( i == 2)
            continue
        println("indice $i")
    }

    for (i in 0..4){
        if ( i == 2)
            return
        println("indice $i")
    }
}