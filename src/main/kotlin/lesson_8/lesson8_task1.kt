package org.example.lesson_8

fun main() {

    val viewsByDays = intArrayOf(3, 5, 1, 2, 3, 1, 2)
    var weeklyViews = 0
    for (i in viewsByDays){
        weeklyViews +=i
    }
    println("Просмотров за неделю $weeklyViews")
}