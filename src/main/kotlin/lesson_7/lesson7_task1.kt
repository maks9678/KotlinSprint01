package org.example.lesson_7

import kotlin.random.Random

const val FROM_THE_NUMBER = 0
const val TO_THE_NUMBER = 9
const val FROM_THE_LETTER = 'a'
const val TO_THE_LETTER = 'z'
const val NUMBER_OF_CHARACTERS = 6

fun main() {

    val lettersToChooseFrom = (FROM_THE_LETTER..TO_THE_LETTER).toList()
    var password = ""
    for (i in 1..NUMBER_OF_CHARACTERS) {
        if (i % 2 == 1) {
            val numberLetter = Random.nextInt(0, lettersToChooseFrom.size )
            password += lettersToChooseFrom[numberLetter]
        } else {
            password += Random.nextInt(FROM_THE_NUMBER, TO_THE_NUMBER)
        }
    }
    println("Сгенерированный пароль: $password")
}