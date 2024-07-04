package org.example.lesson_6

fun main() {

    println("Введите сколько секнд засечь :")
    var markTheSeconds = readln().toInt()
    val stopwatch = 0

    while (markTheSeconds != stopwatch) {
        println("Осталось секунд : $markTheSeconds")
        markTheSeconds--
        Thread.sleep(1000)
    }
    println("Время вышло")
}