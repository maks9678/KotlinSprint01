package org.example.lesson_9

fun main() {
    val listIngredientsPizza = mutableListOf("тесто", "салями", "сыр")
    println("В рецепте есть следующие ингредиенты:")
    listIngredientsPizza.forEach { ingredient: String ->
        println(ingredient)
    }
    println("Желаете добавить еще?")
    val shouldIAddAnIngredient = readln()
    if (shouldIAddAnIngredient == "да") {
        println("Какой ингредиент вы хотите добавить?")
        listIngredientsPizza.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:")
        listIngredientsPizza.forEach { ingredient: String ->
            println(ingredient)
        }
    } else return
}