package org.example.lesson__1_10.lesson_7

const val FIRST_NUMBER = 0
const val NUMERICAL_CONSTANT = 2
fun main() {

    println("Введите число:")
    val userNumber = readln().toInt()
    var numberOfProgression = FIRST_NUMBER
    println(numberOfProgression)
    for (i in FIRST_NUMBER..(userNumber - 2) step 2) {
        numberOfProgression += NUMERICAL_CONSTANT
        println(numberOfProgression)
    }
}