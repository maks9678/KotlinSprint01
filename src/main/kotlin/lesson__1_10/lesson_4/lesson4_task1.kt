package org.example.lesson__1_10.lesson_4

const val TABLES_RESTAURANT = 13

fun main() {
    val bookedToday = 13
    val bookedTomorrow = 9

    println("Доступность столиков на сегодня:${bookedToday==TABLES_RESTAURANT}\nДоступность столиков на завтра:${bookedTomorrow==TABLES_RESTAURANT} ")

}