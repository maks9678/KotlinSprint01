package org.example.lesson_6

import kotlin.random.Random

const val MIN_NUMBER = 1
const val MAX_NUMBER = 9
const val NUMBER_OF_ATTEMPTS = 3

fun main() {

    println("Проверка на робота")
    var attemptCounter = 1
    while (attemptCounter <= NUMBER_OF_ATTEMPTS) {

        var number1 = Random.nextInt(MIN_NUMBER, MAX_NUMBER)
        var number2 = Random.nextInt(MIN_NUMBER, MAX_NUMBER)
        var sumNumber = number1 + number2
        println("Чему равно $number1 + $number2 ?")
        val enteredNumber = readln().toInt()

        if (enteredNumber == sumNumber) {
            println("Добро пожаловать!")
            break
        }
            println("Ответ не верный. Решите заново.")
        attemptCounter++
    }
    if (attemptCounter > NUMBER_OF_ATTEMPTS) println("Доступ запрещен")
}