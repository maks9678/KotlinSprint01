package org.example.lesson_18

fun main() {
    val rectangularBox = Rectangle(3.0, 2.0, 1.5)
    val cube = Cube(2.0)

    println("Площадь поверхности прямоугольной коробки: ${rectangularBox.square()} м²")
    println("Площадь поверхности куба: ${cube.square()} м²")
}

abstract class Package {
    abstract fun square(): Double
}

class Rectangle(val length: Double, val width: Double, val height: Double) : Package() {
    override fun square(): Double {
        return 2 * (length * width + length * height + width * height)
    }
}

class Cube(val sideLength: Double) : Package() {
    override fun square(): Double {
        return 6 * sideLength * sideLength
    }
}