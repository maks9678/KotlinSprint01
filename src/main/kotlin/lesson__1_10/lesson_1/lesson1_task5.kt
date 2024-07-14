package org.example.lesson__1_10.lesson_1

const val TIME_DIVIDER = 60

fun main() {

    val sec = 6480

    val horus = sec / org.example.lesson__1_10.lesson_1.TIME_DIVIDER / org.example.lesson__1_10.lesson_1.TIME_DIVIDER
    val minuts = sec / org.example.lesson__1_10.lesson_1.TIME_DIVIDER % org.example.lesson__1_10.lesson_1.TIME_DIVIDER
    val secRemains = sec % org.example.lesson__1_10.lesson_1.TIME_DIVIDER % org.example.lesson__1_10.lesson_1.TIME_DIVIDER

    println("${"%02d".format(horus)}:${"%02d".format(minuts)}:${"%02d".format(secRemains)}")

}