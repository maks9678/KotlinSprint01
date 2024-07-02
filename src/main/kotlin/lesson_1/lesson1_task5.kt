package org.example.lesson_1

const val TIME_DIVIDER = 60

fun main() {

    val sec = 6480

    val horus = sec / TIME_DIVIDER / TIME_DIVIDER
    val minuts = sec / TIME_DIVIDER % 60
    val secRemains = sec % TIME_DIVIDER % TIME_DIVIDER

    println("${"%02d".format(horus)}:${"%02d".format(minuts)}:${"%02d".format(secRemains)}")

}