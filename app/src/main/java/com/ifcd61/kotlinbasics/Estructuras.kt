package com.ifcd61.kotlinbasics

fun main() {

    println("Estructuras de datos")
    println("Listas inmutables")

    val listaDiasHabiles: List<String>
    listaDiasHabiles = listOf("Lunes","Martes","Miercoles","Jueves","Viernes")

    println("Dias Habiles:\n $listaDiasHabiles")
    println("Primer dia de la lista: ${listaDiasHabiles[0]}")


}