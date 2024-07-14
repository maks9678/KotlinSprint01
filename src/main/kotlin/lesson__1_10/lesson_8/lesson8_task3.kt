package org.example.lesson__1_10.lesson_8

fun main() {
    val pizzaIngredients = arrayOf(
        "тесто", "салями", "грибы", "маслины",
        "сыр", "бекон", "томатный соус"
    )
    println("Какой ингридиент ты хочешь найти?")
    val userIngredient = readln()
    val numberIngredient = pizzaIngredients.indexOf(userIngredient)
    
    if (numberIngredient != -1) {
        println("Ингредиент $userIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }
}