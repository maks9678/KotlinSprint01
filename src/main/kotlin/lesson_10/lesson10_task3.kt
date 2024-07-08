package org.example.lesson_10

fun main() {
    println("Введите длину пароля:")
    val lengthPassword = readln().toInt()

    println("Готовый пароль:")
    println(passwordGeneration(lengthPassword))
}

fun passwordGeneration(lengthPassword: Int): String {
    val numericValues = 0..9
    val specialCharacters = "!\"#$%&'()*+,-./ "
    var password= ""

    for (i in 1..lengthPassword) {
        if (i % 2 != 0) {
            password += (numericValues).random()
        } else {
            val sumbolNumber = (1..specialCharacters.length).random()
            password += specialCharacters[sumbolNumber]
        }
    }
    return password
}
