package org.example.lesson__1_10.lesson_10

const val MIN_LENGTH_PASSWORD = 4

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()
    lengthValidation(login = userLogin, pass = userPassword)
}

fun lengthValidation(login: String, pass: String) {
    if (login.length < MIN_LENGTH_PASSWORD || pass.length < MIN_LENGTH_PASSWORD)
        return println("Логин или пароль недостаточно длинные")
}