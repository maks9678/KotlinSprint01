package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val mail: String,
) {}

fun main() {
    val user1 = User(
        id = 1,
        login = "duego",
        password = "d1234d",
        mail = "diego@mail.ru",
    )
    val user2 = User(
        id = 2,
        login = "cima",
        password = "c1234c",
        mail = "cima@mail.ru",
    )
    println("""
        ${user1.id}
        ${user1.login}
        ${user1.password}
        ${user1.mail}
    """.trimIndent()
    )
    println("""
        ${user2.id}
        ${user2.login}
        ${user2.password}
        ${user2.mail}
    """.trimIndent()
    )
}