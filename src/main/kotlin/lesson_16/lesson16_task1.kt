package org.example.lesson_16

fun main() {
    val playingDice1 = PlayingDice()
    playingDice1.printNumber()
}

class PlayingDice(
    private val randomNumber: Int = (1..6).random(),
) {
    fun printNumber() {
        println("число :$randomNumber")
    }
}
