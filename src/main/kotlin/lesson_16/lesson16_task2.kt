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
        val perimeter = 2 * pi * radius
        println("периметр : $perimeter")
    }

    fun area() {
        val area = pi * radius * radius
        println("площадь : $area")
    }
}