package org.example.lesson_2

fun main() {

    val buff = 0.2
    val crystalOre = 7
    val ironOre = 11

    val buffCristalOne = (crystalOre * buff).toInt()
    val buffIronOne = (ironOre * buff).toInt()

    println("Кристалической руды $buffCristalOne")
    println("Железной руды $buffIronOne")
}
