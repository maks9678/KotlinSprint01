package org.example.lesson_6

fun main() {

    val markTheSeconds = readln().toInt()
    var stopwatch = 0

    while (markTheSeconds != stopwatch) {
        stopwatch++
        Thread.sleep(1000)
    }
    println("Прошло $markTheSeconds секунд")
}