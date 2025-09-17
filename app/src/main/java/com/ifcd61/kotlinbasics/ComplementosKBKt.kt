package com.ifcd61.kotlinbasics

import com.ifcd61.kotlinbasics.Constantes.FECHAINICIO
import com.ifcd61.kotlinbasics.Constantes.SEPARADOR

const val global = 0
//const val  = 0

fun main() {

    val local = 5
    //val global = 6
    println("local: $local")
    println("Global: $global")
    println(FECHAINICIO) //creado en archivo "object" aparte
}

fun local(){
    val local = 4
    println("Local: $local")
    println("Global: $global")

}

fun tema(texto: String){
    println("\n $SEPARADOR $texto $SEPARADOR")
}