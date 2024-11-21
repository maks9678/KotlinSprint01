package org.example.lesson_22

class RegularBook(val title: String, val author: String)
data class DataBook(val title: String, val author: String)

fun main() {
    val book1 = RegularBook("Война и мир", "Толстой")
    val book2 = RegularBook("Война и мир", "Толстой")
    val book3 = DataBook("Война и мир", "Толстой")
    val book4 = DataBook("Война и мир", "Толстой")
    println(book1 == book2)//false, тк сравниваются ссылки, а не значения
    println(book3 == book4)//true, тк сравниваются значения свойств
    println(book1.equals(book3))//false, тк разные классы
}