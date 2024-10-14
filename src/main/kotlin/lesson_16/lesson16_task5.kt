package org.example.lesson_16

fun main() {
    val player1 = Player(name = "Воин", health = 100, impactForce = 10)
    val player2 = Player(name = "Маг", health = 80, impactForce = 15)

    player1.takingDamage(30)
    player2.takingDamage(50)
    player1.healing(20)
    player1.takingDamage(110)
    player1.healing(10)
}

class Player(
    val name: String,
    private var health: Int,
    var impactForce: Int,
) {
    fun takingDamage(damage: Int) {
        if (health > 0) {
            if (damage >= health) death()
            health -= damage
            println("игрок $name получил $damage урона")
        } else println("игрок мертв")
    }

    fun healing(point: Int) {
        if (health > 0) {
            health += point
            println("игрок $name восполнил $point здоровья")
        } else println("игрок мертв")
    }

    private fun death() {
        impactForce = 0
        health = 0
        println("игрок $name умер")
    }
}
