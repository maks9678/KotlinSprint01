package org.example.lesson_18

fun main() {
    val dice1 = Dice4()
    val dice2 = Dice6()
    val dice3 = Dice8()

    val arrayDices = arrayOf<Dice>(dice1, dice2, dice3)
    arrayDices.forEach { it.throwDice() }
}

abstract class Dice(
    _maxNumber: Int,
) {
    val maxNumber = _maxNumber
    fun throwDice() {
        val gotNumber = (1..maxNumber).random()
        println("Выпало число : $gotNumber")
    }
}

class Dice4 : Dice(4)
class Dice6 : Dice(6)
class Dice8 : Dice(8)