package org.example.lesson__1_10.lesson_10

const val LOGIN = "semin2009"
const val PASSWORD = "rediska2"
const val BASKET = "12,23,1234,23"

fun main() {
    val userAccessToken = authorization()
    if (userAccessToken == null) {
        println("неудачная авторизация")
    } else {
        println(BASKET)
    }
}

fun authorization(): String? {
    println("Введите логин:")
    val userLogin = readln()
    println("Введите пароль:")
    val userPass = readln()
    if (userLogin == LOGIN && userPass == PASSWORD) {
        var accessToken = ""
        val charUppercaseRangeForPassword = ('A'..'Z')
        val charLowercaseRangeForPassword = ('a'..'z')
        val charNumberRangeForPassword = ('0'..'9')
        val charRangeForPassword: List<Char> =
            charNumberRangeForPassword + charLowercaseRangeForPassword +
                    charUppercaseRangeForPassword
        for (i in 1..32) {

            accessToken += charRangeForPassword.random()
        }
        println(accessToken)
        return accessToken
    } else return null
}