package org.example.lesson__1_10.lesson_7

const val NUMBER_OF_CHARACTERS = 6

fun main() {
    val charRangeForPassword: CharRange = 'a'..'z'
    val intRangeForPassword: IntRange = 0..9
    var password = ""
    for (i in 1..NUMBER_OF_CHARACTERS) {
        if (i % 2 == 0) {
            password += intRangeForPassword.random()
        } else {
            password += charRangeForPassword.random()
        }
    }
    println("Сгенерированный пароль: $password")
}