package org.example.lesson__1_10.lesson_7

import kotlin.random.Random

fun main() {

    while (true) {
        val generatedPassword = Random.nextInt(1000,9999)
        println("Ваш код авторизации:$generatedPassword")
        println("Введите код:")
        val userPassword = readln().toInt()
        if (generatedPassword == userPassword) {
            println("Привет пользователь")
            return
        }
    }
}
