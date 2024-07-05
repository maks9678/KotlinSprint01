package org.example.lesson_7

fun main() {
    println("Сколько секунд засеч:")
    var userSecond = readln().toInt()
    for (i in 0..userSecond) {
        println(userSecond)
        userSecond -= 1
        Thread.sleep(1000)
    }
    println("Время вышло")
}