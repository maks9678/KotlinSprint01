package org.example.lesson_5

fun main() {

    val example = "Сколько будет 2+4?"
    val answer = readLine()!!.toInt()
    val rightAnswer = 6

    if (answer == rightAnswer) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}