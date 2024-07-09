package org.example.lesson_10

const val MIN_RANDOM_NUMBER = 1
const val MAX_RANDOM_NUMBER = 6

fun main() {
    var numberOfWinningGamesOfAPerson = 0
    while (true) {
        numberOfWinningGamesOfAPerson = gameDice()
        println("Хотите бросить кости еще раз? Введите Да или Нет")
        var continueOrStopGame = readln()
        if (continueOrStopGame == "Да") {
            continue
        } else {
            break
        }
    }
    println("Количество побед игрока: $numberOfWinningGamesOfAPerson")
}

fun gameDice(): Int {
    println("Игрок бросает кости")
    val playerResult: Int = rollOfTheDice()
    println("Игроку выпало: $playerResult ")

    println("Компьютер бросает кости")
    val computerResult: Int = rollOfTheDice()
    println("Компьютеру выпало: $computerResult ")
    var counterOfWinningGamesOfAPerson = 0
    if (playerResult > computerResult) {
        println("Победило человечество")
        counterOfWinningGamesOfAPerson++
    } else if (playerResult == computerResult) println("Ничья")
    else println("Победила машина")
    return counterOfWinningGamesOfAPerson
}

fun rollOfTheDice(): Int {
    return (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
}