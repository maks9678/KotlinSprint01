package org.example.lesson_20

fun main() {
    val list = listOf("отмена", "окей", "назад")
    val lambdaList = list.map { element -> { println("Нажат элемент $element") } }
    lambdaList.forEachIndexed { index, nameButton ->
        if (index % 2 == 0) nameButton()
    }
}
