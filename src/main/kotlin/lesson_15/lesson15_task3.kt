package org.example.lesson_15

fun main() {
    val user1 = User("Петр")
    user1.readTheForum()
    user1.writeMessages("Привет")

    val admin1 = Admin("Анна")
    admin1.readTheForum()
    admin1.writeMessages("Идет дождь")
    admin1.deleteMessages("Неприемлемое сообщение")
    admin1.deleteUser("Василий")
}

abstract class AllUsers(
    val userName: String,
) {
    fun readTheForum() {
        println("Читать форум")
    }

    fun writeMessages(massages: String) {
        println("Написано сообщение: $massages")
    }
}

class User(userName: String) : AllUsers(userName) {}
class Admin(userName: String) : AllUsers(userName) {
    fun deleteMessages(messages: String) {
        println("Удалено сообщение: $messages")
    }

    fun deleteUser(user: String) {
        println("Удален пользователь: $user")
    }
}