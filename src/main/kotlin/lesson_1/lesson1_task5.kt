package org.example.lesson_1

const val timeDivider = 60

fun main() {

    val sec = 6480

    val horus = sec / timeDivider / timeDivider
    val minuts = sec / timeDivider % 60
    val secRemains = sec % timeDivider % timeDivider

    println("${"%02d".format(horus)}:${"%02d".format(minuts)}:${"%02d".format(secRemains)}")

}