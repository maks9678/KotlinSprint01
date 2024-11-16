package org.example.lesson_16

fun main() {
    val user1 = User("alex", "red1")
    val inputPass = readln()
    user1.checkPassword(inputPass)
}

class User(
    val login: String,
    private val password: String,
) {
    fun checkPassword(inputPass: String): Boolean {
        return inputPass == password
    }
}