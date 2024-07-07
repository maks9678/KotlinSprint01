package org.example.lesson_9

fun main() {
    println("Введите названия 5 ингридиетов: ")
    val listingredientsOfTheDich: List<String> = readln().split(", ")
    val sortListIngredientsOfTheDich = listingredientsOfTheDich.sorted()
    println(sortListIngredientsOfTheDich)
}