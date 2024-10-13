package org.example.lesson_16

fun main() {
    val circle1 = Circle(5)
    circle1.area()
    circle1.perimeter()
}

class Circle(
    private val radius: Int,
    private val pi: Double = 3.14,
) {
    fun perimeter() {
        val c = 2 * pi * radius
        println("периметр : $c")
    }

    fun area() {
        val s = pi * radius * radius
        println("площадь : $s")
    }
}