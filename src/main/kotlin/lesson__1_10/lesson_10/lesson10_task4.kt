package org.example.lesson__1_10.lesson_10

const val MIN_RANDOM_NUMBER1 = 1
const val MAX_RANDOM_NUMBER1 = 6

fun main() {
    var playerWins = 0
    while (true) {
        playerWins = gameDice(playerWins)
        val continueGame = onceAgain()
        if (continueGame == "да") {
            continue
        } else {
            break
        }
    }
    println("Количество побед игрока: $playerWins")
}

fun gameDice(playerWins: Int): Int {
    println("Игрок бросает кости")
    val playerResult: Int = rollOfTheDice1()
    println("Игроку выпало: $playerResult ")
    var counterPlayerWins = playerWins
    println("Компьютер бросает кости")
    val computerResult: Int = rollOfTheDice1()
    println("Компьютеру выпало: $computerResult ")
    if (playerResult > computerResult) {
        println("Победило человечество")
        counterPlayerWins++
    } else if (playerResult == computerResult) println("Ничья")
    else println("Победила машина")
    return counterPlayerWins
}

fun rollOfTheDice1(): Int {
    return (MIN_RANDOM_NUMBER1..MAX_RANDOM_NUMBER1).random()
}

fun onceAgain(): String {
    println("Хотите бросить кости еще раз? Введите Да или Нет")
    val yesNo = readln().lowercase()
    return yesNo
}