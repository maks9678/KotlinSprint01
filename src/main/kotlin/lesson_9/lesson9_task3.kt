package org.example.lesson_9

fun main() {

    val listOfIngredientsForOneDish = mutableListOf(2, 50, 15)
    println("Сколько будет порций?")
    val numberOfDishes = readln().toInt()

    for (i in 0..listOfIngredientsForOneDish.size - 1) {
        listOfIngredientsForOneDish[i] *= numberOfDishes
    }
    println(
        "На $numberOfDishes порций вам понадобится: " +
                "Яиц – ${listOfIngredientsForOneDish[0]}, " +
                "молока – ${listOfIngredientsForOneDish[1]}, " +
                "сливочного масла – ${listOfIngredientsForOneDish[2]}"
    )
}