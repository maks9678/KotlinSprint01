package org.example.lesson__1_10.lesson_9

fun main() {
    val listIngredientsPizza = listOf("тесто", "салями", "сыр", "соус")
    println("В рецепте есть следующие ингредиенты:")
    listIngredientsPizza.forEach {
        println(it)
    }
}