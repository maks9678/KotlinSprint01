package org.example.lesson__1_10.lesson_5

const val AGE_OF_MAJORITY = 18

fun main() {

    val currentYear = 2024
    println("Введите свой год рождения:")
    val yearOfBirth = readLine()!!.toInt()

    val userAge = currentYear - yearOfBirth

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Придется подрасти")

}