package org.example.lesson_2

fun main() {

    val departureTime: List<String> = "9:39".split(":")
    val travelTimeMinuts = 457
    val minutesPerHour = 60

    val trevelTimeHorus = travelTimeMinuts / minutesPerHour
    val remainingTrevelMinutes = travelTimeMinuts % minutesPerHour

    val arrivalHours = departureTime[0].toInt() + trevelTimeHorus
    val arrivalMinutes = departureTime[1].toInt() + travelTimeMinuts % minutesPerHour

    println("${arrivalHours + arrivalMinutes / minutesPerHour}:${arrivalMinutes % minutesPerHour}")

}


