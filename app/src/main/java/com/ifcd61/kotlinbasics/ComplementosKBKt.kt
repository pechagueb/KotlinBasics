package com.ifcd61.kotlinbasics

val global = 0

fun main() {
    val local = 5
    val global = 6
    println("local: $local")
    println("Global: $global")
    local()
}

fun local(){
    val local = 4
    println("Local: $local")
    println("Global: $global")

}