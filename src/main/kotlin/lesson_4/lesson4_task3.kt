package org.example.lesson_4

fun main() {

    val weather: Boolean = true
    val awning: Boolean = true
    val humidity: Int = 20
    val season = "не зима"

    val weatherToday: Boolean = true
    val awningToday: Boolean = true
    val humidityToday: Int = 20
    val seasonToday = "зима"

    val checkingTheConditions = weather == weatherToday && awning == awningToday && humidity == humidityToday && season == seasonToday

    println("Благоприятные ли условия сейчас для роста бобовых? $checkingTheConditions")

}

