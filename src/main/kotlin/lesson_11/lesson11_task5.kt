package org.example.lesson_11

fun main() {
    val forum1 = Forum()
    val user1 = ForumMember(1, "alex")
    val user2 = ForumMember(2, "oleg")
    forum1.forumPosts.add(user1)
    forum1.forumPosts.add(user2)
    forum1.printThread()
}

class Forum(
) {
    val forumPosts: MutableList<ForumMember> = mutableListOf()
    fun printThread() {
    }
}

class ForumMember(
    _userId: Int,
    _userName: String,
) {
    val userId = _userId
    val userName = _userName
    fun createNewUser(userName: String) {

    }
}

class ForumMessage(
    val authorId: Int,
    val message: String,
) {
    fun createNewMessage(userId: Int) {}
}
//Реализовать класс работы форума (Forum).
//Для реализации создай дополнительные классы для сущностей “Член форума”
//(с полями userId и userName) и “Сообщение форума” (с полями authorId и message).
//
//Примени паттерн “Фабрика” для создания пользователей и сообщений форума.
//Напрямую объекты не создаются, логика должна быть инкапсулирована внутри методов класса.
//
//- createNewUser() создает новых пользователей, принимая имя пользователя.
//Метод сохраняет нового пользователя в общий список и одновременно
//возвращает новый объект. Генерация id-шников новых пользователей происходит внутри;
//- createNewMessage() создает сообщения, принимая id пользователя.
//Сообщения создаются только если такой пользователь есть на форуме;
//- printThread() печатает в консоль все сообщения добавленные на форум в формате:
//
//автор: сообщение
//автор: сообщение
//
//Создай экземпляр Forum и продемонстрируй его работу, добавив двух пользователей
//и по два сообщения от каждого пользователя.