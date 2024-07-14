package org.example.lesson__1_10.lesson_6

fun main() {

    println("Введите сколько секнд засечь :")
    val markTheSeconds = readln().toInt()
    val stopwatch = 1000L * markTheSeconds
    Thread.sleep(stopwatch)
    println("Прошло $markTheSeconds секунд")
}