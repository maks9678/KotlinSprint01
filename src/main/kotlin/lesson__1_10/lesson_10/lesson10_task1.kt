package org.example.lesson__1_10.lesson_10

private const val MIN_RANDOM_NUMBER = 1
private const val MAX_RANDOM_NUMBER = 6

fun main() {
    println("Игрок бросает кости")
    val playerResult: Int = rollOfTheDice2()
    println("Игроку выпало: $playerResult ")

    println("Компьютер бросает кости")
    val computerResult: Int = rollOfTheDice2()
    println("Компьютеру выпало: $computerResult ")

    if (playerResult > computerResult) println("Победило человечество")
    else if (playerResult == computerResult) println("Ничья")
    else println("Победила машина")

}

fun rollOfTheDice2(): Int {
    return (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
}