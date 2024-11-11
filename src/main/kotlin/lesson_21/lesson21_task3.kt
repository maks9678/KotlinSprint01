package org.example.lesson_21

fun main() {
    val player1 = Player("maksim", 70, 100)
    val healingPotion: (Player) -> Unit = { player -> player.currentHp = player.maxXp }
    println("Игрок здоров:${player1.isHealthy()}")
    healingPotion(player1)
    println("Игрок здоров:${player1.isHealthy()}")
}

class Player(val name: String, var currentHp: Int, val maxXp: Int)

fun Player.isHealthy(): Boolean {
    return currentHp == maxXp
}