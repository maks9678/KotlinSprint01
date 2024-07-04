package org.example.lesson_6
import kotlin.random.Random

const val NUMBER_OF_ATTEMPTS = 5
const val MIN_HIDDEN_NUMBER = 1
const val MAX_HIDDEN_NUMBER = 9

fun main() {

    val nidderNumber = Random.nextInt(MIN_HIDDEN_NUMBER, MAX_HIDDEN_NUMBER)
    var attemptCounter = 1

    while (attemptCounter <= NUMBER_OF_ATTEMPTS) {
        println("Введите число:")
        val enteredNumber = readln().toInt()

        if (enteredNumber == nidderN1umber) {
            println("Это была великолепная игра!")
            break
        }
        var remainedAttempts = NUMBER_OF_ATTEMPTS - attemptCounter
        println("Неверно осталось $remainedAttempts попыток")
        attemptCounter++
    }
    println("Было загадано число $nidderNumber")
}