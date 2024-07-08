package org.example.lesson_10

fun main() {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPassword = readln()
    lengthValidation(login = userLogin, pass = userPassword)
}

fun lengthValidation(login: String, pass: String) {
    if (login.length < 4 || pass.length < 4)
        return println("Логин или пароль недостаточно длинные")
}