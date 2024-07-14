package org.example.lesson__1_10.lesson_8

fun main() {
    val pizzaIngredients = arrayOf(
        "тесто", "салями", "грибы", "маслины",
        "сыр", "бекон", "томатный соус"
    )
    println("Какой ингридиент ты хочешь найти?")
    val userIngredient = readln()
    for (i in pizzaIngredients) {
        if (i == userIngredient) {
            println("Ингредиент $userIngredient в рецепте есть")
            return
        }
    }
    println("Такого ингредиента в рецепте нет")
}