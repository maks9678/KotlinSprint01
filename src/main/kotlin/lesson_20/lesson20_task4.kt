package org.example.lesson_20

fun main() {
    val list = listOf("отмена", "окей", "назад")
    val printList = list.mapIndexed() { index, it ->
        if (index % 2 == 0) {
            println("Нажат элемент $it")
        }
    }
}