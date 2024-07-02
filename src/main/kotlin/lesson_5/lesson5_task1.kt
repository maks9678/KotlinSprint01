package org.example.lesson_5

fun main() {

    val number1 = 4
    val number2 = 2
    println("Сколько будет $number1+$number2?")
    val answer = readln().toInt()

    if (answer == (number1+number2)) println("Добро пожаловать!")
    else println("Доступ запрещен.")

}