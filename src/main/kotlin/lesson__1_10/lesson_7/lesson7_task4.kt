package org.example.lesson__1_10.lesson_7

fun main() {
    println("Сколько секунд засеч:")
    val userSecond = readln().toInt()
    for (i in userSecond downTo 0) {
        println(i)
        Thread.sleep(1000)
    }
    println("Время вышло")
}