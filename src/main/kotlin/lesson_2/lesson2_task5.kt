package org.example.lesson_2
import kotlin.math.*

fun main() {

    val customerAccount: Int = 70_000
    val percent: Double = 1.167
    val period = 20

    val estimateAmount: Double = customerAccount * (percent.pow(period))

    print(String.format("%.3f", estimateAmount))
}
