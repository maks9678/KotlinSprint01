package org.example.lesson_22

data class DataBook3(val title: String, val author: String, val yearPublication: Int)

fun main() {
    val book = DataBook3("Война и мир", "Толстой", 1867)
    val titleBook = book.title
    val authorBook = book.author
    val yearPublicationBook = book.yearPublication
    println(titleBook)
    println(authorBook)
    println(yearPublicationBook)
}