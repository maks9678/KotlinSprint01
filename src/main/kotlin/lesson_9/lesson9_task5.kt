package org.example.lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    println("Введите $NUMBER_OF_INGREDIENTS названий ингридиентов:")
    val listIngredients = mutableListOf<String>()
    for (i in 1..NUMBER_OF_INGREDIENTS) {
        println("Введите $i ингридиент:")
        listIngredients.add(readln())
    }
    listIngredients.sort()
    listIngredients.distinct()

    listIngredients.forEach {
        if (listIngredients[listIngredients.lastIndex] == it) print(it)
        else print("$it, ")
    }
}