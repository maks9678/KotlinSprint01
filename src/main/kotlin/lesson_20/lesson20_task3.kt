package org.example.lesson_20

fun main() {
    val player1 = Player20("Maksin", false)
    openDoor(player1.isKey)
    player1.fundKey()
    openDoor(player1.isKey)

}

val openDoor: (Boolean) -> Unit = { key ->
    if (key != false) println("дверь открыта") else println("дверь заперта")
}

class Player20(val name: String, var isKey: Boolean) {
    fun fundKey() {
        isKey = true
    }
}