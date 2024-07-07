package org.example.lesson_7

fun main() {
    val charUppercaseRangeForPassword = ('A'..'Z')
    val charLowercaseRangeForPassword = ('a'..'z')
    val charNumberRangeForPassword = ('0'..'9')
    val charRangeForPassword: List<Char> =
        charNumberRangeForPassword + charLowercaseRangeForPassword +
                charUppercaseRangeForPassword
    println("Введите размер пароля: ")
    val passwordLength = readln().toInt()

    if (passwordLength >= 6) {
        val password = mutableListOf<Char>()
        password.add(charUppercaseRangeForPassword.random())
        password.add(charLowercaseRangeForPassword.random())
        password.add(charNumberRangeForPassword.random())

        for (i in 4..passwordLength) {
            password += charRangeForPassword.random()
        }
        password.shuffle()
        println("Сгенерированный пароль:")
        password.forEach { print(it) }
    } else {
        println("Пароль должен быть длиной не менее 6 ")
    }
}