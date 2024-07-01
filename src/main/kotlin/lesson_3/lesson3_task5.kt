package org.example.lesson_3

fun main() {

    val recordingMove = "D2-D4;0".split("-", ";")

    val fromMotion = recordingMove[0]
    val whereMotion = recordingMove[1]
    val numberMotion = recordingMove[2]

    println(fromMotion)
    println(whereMotion)
    println(numberMotion)

}
