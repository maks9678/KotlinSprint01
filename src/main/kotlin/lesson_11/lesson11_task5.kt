package org.example.lesson_11

class Forum {
    val users = mutableListOf<User5>()
    val messages = mutableListOf<Message>()
    var userIdCounter = 1
    var messageIdCounter = 1

    fun createNewUser(userName: String): User5 {
        val user = User5(userIdCounter++, userName)
        users.add(user)
        return user
    }

    fun createNewMessage(authorId: Int, message: String) {
        if (users.any { it.userId == authorId }) {
            val newMessage = Message(messageIdCounter++, authorId, message)
            messages.add(newMessage)
        } else {
            println("Пользователь с id $authorId не найден.")
        }
    }

    fun printThread() {
        for (message in messages) {
            val authorName = users.find { it.userId == message.authorId }?.userName
            if (authorName != null) {
                println("$authorName: ${message.message}")
            }
        }
    }
}

class User5(val userId: Int, val userName: String) {}
class Message(val messageId: Int, val authorId: Int, val message: String)

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alice")
    val user2 = forum.createNewUser("Bob")

    forum.createNewMessage(user1.userId, "Привет всем!")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Привет, Алис!")
    forum.createNewMessage(user2.userId, "Все отлично!")

    forum.printThread()
}