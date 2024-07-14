package org.example.lesson__1_10.lesson_2
import kotlin.math.*

fun main() {

    val customerAccount: Int = 70_000
    val percent: Double = 16.7
    val period = 20

    val estimateAmount: Double = customerAccount * ((1 + percent / 100).pow(period))

    print(String.format("%.3f", estimateAmount))
}
