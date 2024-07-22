package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val mail: String,
    var bio: String = "",
) {
    fun showInformation() {
        println(
            """
        $id
        $login
        $password
        $mail
        $bio
    """.trimIndent()
        )
    }

    fun addBio() {
        println("Заполните биографию")
        bio = readln()
    }

    fun changePassword() {
        println("введите текущий пароль")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("введите новый пароль")
            password = readln()
            println("пароль изменен")
        }
    }
}

fun main() {
    val user1 = User2(
        id = 1,
        login = "duego",
        password = "d1234d",
        mail = "diego@mail.ru",
    )
    user1.addBio()
    user1.changePassword()
    user1.showInformation()

}