package org.example.lesson_9

fun main(){
    val listIngredientsPizza = listOf ("тесто", "салями","сыр","соус")
    println("В рецепте есть следующие ингредиенты:")
    for (i in listIngredientsPizza ){
        println(i)
    }
}