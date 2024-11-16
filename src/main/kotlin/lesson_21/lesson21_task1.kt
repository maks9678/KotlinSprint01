package org.example.lesson_21

fun main() {
    val text = "hello"
    println("Гласных букв:${text.vowelCount()}")
}

fun String.vowelCount(): Int {
    val listLower = "aeuyoi"
    return this.toLowerCase().count { it in listLower }
}