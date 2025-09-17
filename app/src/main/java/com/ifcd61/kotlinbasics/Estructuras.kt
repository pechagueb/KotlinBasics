package com.ifcd61.kotlinbasics

fun main() {

    println("Estructuras de datos")
    println("Listas inmutables")

    val listaDiasHabiles: List<String>
    listaDiasHabiles = listOf("Lunes","Martes","Miercoles","Jueves","Viernes")

    println("Dias Habiles:\n $listaDiasHabiles")
    println("Primer dia de la lista: ${listaDiasHabiles[0]}")

    val listaamigos: MutableList<String>
    listaamigos = mutableListOf("Maria", "Juan", "Carolina")
    println("Lista mutable:\n $listaamigos")

    listaamigos.add("Pedro")
    println("Lista amigos: $listaamigos")

    listaamigos.remove("Pedro")
    println("Lista amigos: $listaamigos")

    listaamigos.removeAt(0)
    println("Lista amigos: $listaamigos")

    //listaamigos.set(2, "Luis")
    listaamigos[1] = "Luis"
    println("Lista amigos: $listaamigos")

    println("Diccionarios")

    val mapInventario = mutableMapOf<String,Int>()
    mapInventario["T1"] = 15
    mapInventario["M2"] = 20
    mapInventario["T2"] = 10

    println("Valores: ${mapInventario.values}")
    println("Claves: ${mapInventario.keys}")

    println("Transformaciones")

    val precios = listOf(10,20,30)
    println("Impuestos: ${precios.map { it * .16 }}")

    val bebidas = listOf("soda","cerveza","agua")
    println("Menu: ${bebidas zip precios}")

    val numeros = listOf(listOf(1,2,3), listOf(4,5,6), listOf(7,8,9))
    println("Lista de listas: $numeros")
    println(numeros.flatten())

    println("Filtros")
    val herramientas = listOf("tuercas","martillos","tablas")
    println(herramientas.filter { it.length <= 8 })
    println(herramientas.filter { it.contains(other = "r") })
    println("Indice de martillos: ${herramientas.indexOf("martillos")}")

    println("Ordenamiento Listas")
    println(listaDiasHabiles)
    println(listaDiasHabiles.sorted())
    println(listaDiasHabiles.reversed())
    println(listaDiasHabiles.sortedBy { it.length })



}