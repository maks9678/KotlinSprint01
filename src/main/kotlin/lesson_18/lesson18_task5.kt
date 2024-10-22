package org.example.lesson_18

fun main() {
    val screen = Screen()
    val circle = Circle("MyCircle", 1.0f, 2)
    val square = Square("MySquare", 3, 4)
    val dot = Dot("MyDot", 5.0f, 6.0f)

    screen.draw(circle)
    screen.draw(square)
    screen.draw(dot)
}

abstract class Figure(
    val name: String,
    val x: Float,
    val y: Float,
)

class Circle(name: String, x: Float, y: Float) : Figure(name, x, y) {
    constructor(name: String, x: Float, y: Int) : this(name, x, y.toFloat())
    constructor(name: String, x: Int, y: Float) : this(name, x.toFloat(), y)
    constructor(name: String, x: Int, y: Int) : this(name, x.toFloat(), y.toFloat())
}

class Square(name: String, x: Float, y: Float) : Figure(name, x, y) {
    constructor(name: String, x: Float, y: Int) : this(name, x, y.toFloat())
    constructor(name: String, x: Int, y: Float) : this(name, x.toFloat(), y)
    constructor(name: String, x: Int, y: Int) : this(name, x.toFloat(), y.toFloat())
}

class Dot(name: String, x: Float, y: Float) : Figure(name, x, y) {
    constructor(name: String, x: Float, y: Int) : this(name, x, y.toFloat())
    constructor(name: String, x: Int, y: Float) : this(name, x.toFloat(), y)
    constructor(name: String, x: Int, y: Int) : this(name, x.toFloat(), y.toFloat())
}

class Screen {
    fun draw(circle: Circle) {
        println("Нарисована фигура $circle")
    }

    fun draw(square: Square) {
        println("Нарисована фигура $square")
    }

    fun draw(dot: Dot) {
        println("Нарисована фигура $dot")
    }
}