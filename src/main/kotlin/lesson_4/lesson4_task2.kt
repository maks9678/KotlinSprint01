package org.example.lesson_4

val MIN_WEIGHT = 35
val MAX_WEIGHT = 100
val MAX_VOLUME = 100

fun main() {

    val cargoWeight1 = 20
    val cargoVolume1 = 80
    val cargoWeight2 = 50
    val cargoVolume2 = 100

    println("Груз с весом 20 кг и объемом 80 л соответствует категории 'Average': ${cargoWeight1 > MIN_WEIGHT && cargoWeight1 <= MAX_WEIGHT && cargoVolume1 < MAX_VOLUME}")
    println("Груз с весом 50 кг и объемом 100 л соответствует категории 'Average': ${cargoWeight2 > MIN_WEIGHT && cargoWeight2 <= MAX_WEIGHT && cargoVolume2 < MAX_VOLUME}")

}