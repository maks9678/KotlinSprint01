package org.example.lesson_17

fun main() {
    val user1 = User("ЕгорРулит", "zashita24")
    user1.login = "Гор"
    user1.password = "zima-lito12"
    println("Пароль: ${user1.password}")
}

class User(login: String, password: String) {
    var login = login
        set(value) {
            field = value
            println("Успешная сменя логина")
        }
    var password = password
        get() {
            return "*".repeat(field.length)
        }
        set(value) {
            println("Вы не можете изменить пароль")
        }

}