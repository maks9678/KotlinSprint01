package org.example.lesson__1_10.lesson_6

import kotlin.random.Random

const val ATTEMPTS_NUMBER = 5
const val MIN_HIDDEN_NUMBER = 1
const val MAX_HIDDEN_NUMBER = 9

fun main() {

    val nidderNumber = Random.nextInt(MIN_HIDDEN_NUMBER, MAX_HIDDEN_NUMBER)
    var attemptCounter: Int = 1

    while (attemptCounter <= ATTEMPTS_NUMBER) {
        println("Введите число:")
        val enteredNumber = readln().toInt()

        if (enteredNumber == nidderNumber) {
            println("Это была великолепная игра!")
            break
        }
        var remainedAttempts = ATTEMPTS_NUMBER - attemptCounter
        println("Неверно осталось $remainedAttempts попыток")
        attemptCounter++
    }
    println("Было загадано число $nidderNumber")
}