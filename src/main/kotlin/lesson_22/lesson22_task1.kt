package org.example.lesson_22

fun main() {
    val book1 = RegularBook("Война и мир", "Толстой")
    val book2 = RegularBook("Анна Каренина", "Толстой")
    val book3 = DataBook("Бесы", "Достоевский")
    val book4 = DataBook("Идиот", "Достоевский")

}

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)