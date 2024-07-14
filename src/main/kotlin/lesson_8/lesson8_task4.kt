package org.example.lesson_8

fun main() {
    println("Список ингридиентов:")
    val arrayIngredients = arrayOf("тесто", "салями", "грибы", "маслины", "сыр", "бекон", "томатный соус")
    for (i in arrayIngredients) {
        println(i)
    }
    println("Какой ингридиент заменить?")
    val deliteIngredien = readln()
    val numberDeliteIngredient = arrayIngredients.indexOf(deliteIngredien)

    if (numberDeliteIngredient != -1) {
        println("Какой ингридиент добавить?")
        val addIngredien = readln()
        arrayIngredients[numberDeliteIngredient] = addIngredien
        println("Готово! Вы сохранили следующий список:")
        for (i in arrayIngredients) {
            println(i)
        }
    } else {
        println("Такого ингредиента в списке нет")
    }
}