package org.example.lesson_9

const val NUMBER_OF_INGREDIENTS = 5

fun main() {
    println("Введите $NUMBER_OF_INGREDIENTS названий ингридиентов:")
    val listIngredients = mutableListOf<String>()
    for (i in 1..NUMBER_OF_INGREDIENTS) {
        println("Введите $i ингридиент:")
        listIngredients.add(readln())
    }
    listIngredients.forEach {
        if (it.isEmpty() != it.isNotEmpty()) {
            listIngredients.remove(it)
        }
    }
    listIngredients.sort()
    listIngredients[1].uppercase()
    listIngredients.forEach {
        print("$it, ")
    }
}