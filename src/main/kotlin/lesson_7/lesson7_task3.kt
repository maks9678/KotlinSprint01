package org.example.lesson_7

const val FIRST_NUMBER = 0
const val NUMERICAL_CONSTANT = 2
fun main() {

    println("Введите число:")
    val userNumber = readln().toInt()
    var numberOfProgression = FIRST_NUMBER
    println(numberOfProgression)
    for (i in FIRST_NUMBER..(userNumber / NUMERICAL_CONSTANT) - 1) {
        numberOfProgression += NUMERICAL_CONSTANT
        println(numberOfProgression)
    }
}