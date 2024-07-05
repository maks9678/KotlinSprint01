package org.example.lesson_7

import kotlin.random.Random

fun main() {
    val charRangeForPassword = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    println("Введите размер пароля: ")
    val passwordLength = readln().toInt()

    if (passwordLength >= 6) {
        var password = ""

        for (i in 1..passwordLength) {
            val randomNumber = Random.nextInt(0, charRangeForPassword.size)
            password += charRangeForPassword[randomNumber]
        }
        println("Сгенерированный пароль: $password")
    } else {
        println("Пароль должен быть длиной не менее 6 ")
    }
}