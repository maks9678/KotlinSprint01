package org.example.lesson_20

fun main() {
    val player1 = Player("maksim", 70, 100)
    val healingPotion: (Player) -> Unit = { player -> player.currentHp = player.maxXp }
    healingPotion(player1)
}

class Player(val name: String, var currentHp: Int, val maxXp: Int)