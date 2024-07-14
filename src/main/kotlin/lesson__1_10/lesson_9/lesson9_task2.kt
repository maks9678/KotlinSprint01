package org.example.lesson__1_10.lesson_9

const val YES = "да"

fun main() {
    val listIngredientsPizza = mutableListOf("тесто", "салями", "сыр")
    println("В рецепте есть следующие ингредиенты:")
    listIngredientsPizza.forEach { ingredient: String ->
        println(ingredient)
    }
    println("Желаете добавить еще?")
    val shouldIAddAnIngredient = readln()
    if (shouldIAddAnIngredient == YES) {
        println("Какой ингредиент вы хотите добавить?")
        listIngredientsPizza.add(readln())
        println("Теперь в рецепте есть следующие ингредиенты:")
        listIngredientsPizza.forEach { ingredient: String ->
            println(ingredient)
        }
    }
    return
}