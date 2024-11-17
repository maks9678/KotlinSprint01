package org.example.lesson_21

fun main() {
    val text = File("text.txt")
    text.writeText("")
    text.writeDownWord("красный")
}

fun File.writeDownWord(_word: String) {
    val word = _word.lowercase()
    val currentContent = this.readText()
    this.writeText("$word\n $currentContent")
}