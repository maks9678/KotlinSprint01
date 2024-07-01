package org.example.lesson_5

import kotlin.random.Random

fun main() {

    val winningList = List(3) { Random.nextInt(0, 2) }

    println("Введите три числа от 0 до 42:")
    val userNumber = listOf(readLine()!!.toInt(), readLine()!!.toInt(), readLine()!!.toInt())

    val numberOfMatches = (winningList.intersect(userNumber)).size
    if (numberOfMatches == 2) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if (numberOfMatches == 1) {
        println("Вы выиграли утешительный приз!")
    } else {
        println("Неудача!")
    }
    println("Правильные цифры \n$winningList")
}