package org.example.lesson__1_10.lesson_2

fun main() {

    val buff = 20
    val crystalOre = 7
    val ironOre = 11
    val percentageInNumber = 100

    val buffCristalOne = (crystalOre * buff / percentageInNumber).toInt()
    val buffIronOne = (ironOre * buff / percentageInNumber).toInt()

    println("Кристалической руды $buffCristalOne")
    println("Железной руды $buffIronOne")
}
