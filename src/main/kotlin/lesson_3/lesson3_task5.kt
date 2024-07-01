package org.example.lesson_3

fun main() {

    val recordingMove = "D2-D4;0"

    val fromMotion = recordingMove[1] + recordingMove[2]
    val whereMotion = recordingMove[4] + recordingMove[5]
    val numerMotion = recordingMove[7]

    println(fromMotion)
    println(whereMotion)
    println(numerMotion)

}
