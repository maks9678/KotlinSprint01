package org.example.lesson__1_10.lesson_4

const val IS_SUNNY: Boolean = true
const val IS_AWNING_OPEN: Boolean = true
const val HUMIDITY: Int = 20
const val SEASON: String = "зима"

fun main() {

    val isSunnyToday: Boolean = true
    val isAwningOpenToday: Boolean = true
    val humidityToday: Int = 20
    val seasonToday = "зима"

    val checkingTheConditions = IS_SUNNY == isSunnyToday && IS_AWNING_OPEN == isAwningOpenToday && HUMIDITY == humidityToday && SEASON != seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $checkingTheConditions")

}

