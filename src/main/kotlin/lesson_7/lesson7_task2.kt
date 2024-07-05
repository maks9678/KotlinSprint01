package org.example.lesson_7

import kotlin.random.Random

const val MIN_NUMBER = 1000
const val MAX_NUMBER = 9999

fun main() {

    while (true) {
        val generatedPassword = Random.nextInt(MIN_NUMBER, MAX_NUMBER)
        println("Ваш код авторизации:$generatedPassword")
        println("Введите код:")
        val userPassword = readln().toInt()
        if (generatedPassword == userPassword) {
            println("Привет пользователь")
            return
        } else continue
    }
}
