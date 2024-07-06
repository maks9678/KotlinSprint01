package org.example.lesson_9

fun main() {
    println("Введите названия 5 ингридиетов: ")
    val listingredientsOfTheDich = readln().split(", ").toMutableList()
    val sortListIngredientsOfTheDich = listingredientsOfTheDich.sort()
    println(sortListIngredientsOfTheDich)
    //sortListIngredientsOfTheDich.forEach { println(it) }
}