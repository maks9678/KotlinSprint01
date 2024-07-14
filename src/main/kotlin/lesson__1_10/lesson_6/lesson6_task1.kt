package org.example.lesson__1_10.lesson_6

fun main() {

    println("Зарегистрируйте аккаунт ")
    println("Введите логин:")
    val login = readln()
    println("Введите пароль:")
    val pass = readln()
    println("Пользователь зарегистрирован. Пройдите авторизацию.")

    do {
        println("Введите логин:")
        val loginAuthorization = readln()
        println("Введите пароль:")
        val passAuthorization = readln()
    } while (login != loginAuthorization && pass != passAuthorization)

    println("Авторизация прошла успешно")
}