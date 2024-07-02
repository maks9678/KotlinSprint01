package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val winningList = List(3) { Random.nextInt(0, 42) }

    println("Введите три числа от 0 до 42:")
    val userNumber = listOf(readln().toInt(), readln().toInt(), readln().toInt())

    val numberOfMatches = (winningList.intersect(userNumber)).size
    when (numberOfMatches) {
        3 -> println("Поздравляем! Вы выиграли главный приз!")
        2 -> println("Вы выиграли утешительный приз!")
        1 -> println("Вы выиграли утешительный приз!")
        0 -> println("Неудача!")
    }
    println("Правильные цифры \n$winningList")
}