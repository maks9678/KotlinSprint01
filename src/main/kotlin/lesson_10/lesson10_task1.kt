package org.example.lesson_10

const val MIN_RANDOM_NUMBER = 1
const val MAX_RANDOM_NUMBER = 6

fun main() {
    println("Игрок бросает кости")
    val playerResult: Int = rollOfTheDice()
    println("Игроку выпало: $playerResult ")

    println("Компьютер бросает кости")
    val computerResult: Int = rollOfTheDice()
    println("Компьютеру выпало: $computerResult ")

    if (playerResult > computerResult) println("Победило человечество")
    else if (playerResult == computerResult) println("Ничья")
    else println("Победила машина")

}

fun rollOfTheDice(): Int {
    return (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
}