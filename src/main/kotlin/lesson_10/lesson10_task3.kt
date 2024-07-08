package org.example.lesson_10

fun main() {
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()

    println("Готовый пароль:")
    println(passwordGeneration(lengthPassword))
}

fun passwordGeneration(lengthPassword: Int): String {
    val numericValues = 0..9
    val specialCharacters = 32..47
    var password = ""

    for (i in 1..lengthPassword) {
        if (i % 2 != 0) {
            password += (numericValues).random()
        } else {
            password += (specialCharacters).random().toByteArray()
        }
    }
    return password
}
