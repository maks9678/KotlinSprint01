package org.example.lesson_20

fun main() {
    val list = listOf("отмена", "окей", "назад")
    val lambdaList = list.map { element -> { println("Нажат элемент $element") } }
    for (i in lambdaList.indices) {
        if (i % 2 == 1) {
            lambdaList[i].invoke()
        }
    }
}