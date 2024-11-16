package org.example.lesson_21

fun main() {
    val lisNumber = listOf(12, 1, 2, 3, 5, 6, 7)
    println("Сумма четных чиселЖ ${lisNumber.evenNumbersSum()}")
}

fun List<Int>.evenNumbersSum(): Int {
    val sum = this.filter { it % 2 == 0 }.sum()
    return sum
}