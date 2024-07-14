package org.example.lesson_8

fun main() {
    println("Введите количество ингридиентов")
    val numberIngredients = readln().toInt()
    val arrayIngredients = Array(numberIngredients, { "" })


    for (i in 0..numberIngredients - 1) {
        println("Введите ${i + 1} ингридиент")
        arrayIngredients[i] = readln()
    }
    print("Список ингридиентов:")
    for (i in arrayIngredients) {
        if (i == arrayIngredients[numberIngredients - 1]) print(" $i")
        else print(" $i,")
    }
}