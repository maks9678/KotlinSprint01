package org.example.lesson_22

class RegularBook2(val title: String, val author: String)
data class DataBook2(val title: String, val author: String)

fun main() {
    val book1 = RegularBook2("Война и мир", "Толстой")
    val book2 = DataBook2("Война и мир", "Толстой")
    println(book1)//печатает название класса и уникальный идентификатор,
    // для понятного отображение необходимо переопределить toString
    println(book2)//метод toString переопределен под капотом
}