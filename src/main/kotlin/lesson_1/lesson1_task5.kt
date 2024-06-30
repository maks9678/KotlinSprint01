package org.example.lesson_1

fun main() {

    val sec = 6480
    val timeConverter = 60

    val horus = sec / timeConverter / timeConverter
    val minuts = sec / timeConverter % 60
    val secRemains = sec % timeConverter % timeConverter

    println("$horus:$minuts:$secRemains")


}