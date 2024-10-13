package org.example.lesson_14

class Chat() {
    val listOfMessages = mutableListOf<Message>()
    fun addMessage(idMessage: Int, contentMessage: String) {
        listOfMessages.add(Message(idMessage, contentMessage))
    }

    fun addThreadMessage(parentMessageId: Int, contentChildMessage: String) {
        listOfMessages.add(ChildMessage(parentMessageId, contentChildMessage))
    }

    fun printChat() {
        val groupedMessages = listOfMessages.groupBy { it.parentMessageId }

        for ((parentId, messages) in groupedMessages) {
            messages.forEach { message ->
                message.print()
            }
        }
    }
}

open class Message(
    val idMessage: Int,
    val contentMessage: String,
) {
    open val parentMessageId: Int = idMessage
    open fun print() {
        println("$idMessage: $contentMessage")
    }
}
class ChildMessage(
    val parentId: Int,
    val contentChildMessage: String,
) : Message(parentId, contentChildMessage) {
    override val parentMessageId: Int = parentId
    override fun print() {
        println("\t$contentMessage")
    }
}