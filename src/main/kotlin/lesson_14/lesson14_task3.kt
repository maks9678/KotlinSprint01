package org.example.lesson_14

fun main() {
    val listFigures = mutableListOf<Figure>()
    listFigures.add(Rectangle("black", 12, 10))
    listFigures.add(Rectangle("black", 5, 18))
    listFigures.add(Circle("while", 2))
    listFigures.add(Circle("while", 4))

    val totalBlackPerimeter = listFigures.filter { it.color == "black" }.sumOf{ it.perimeter() }

    val totalWhiteArea = listFigures.filter { it.color == "white" }.sumOf { it.square() }

    println("Сумма периметров черных фигур: $totalBlackPerimeter")
    println("Сумма площадей белых фигур: $totalWhiteArea")
}

abstract class Figure(
    open val color: String,
) {
    abstract fun square():Double
    abstract fun perimeter():Double
}

class Rectangle(override val color: String, val width: Int, val height: Int) : Figure(color) {
    override fun square(): Double {
        val squareRectangl = width * height
        return squareRectangl.toDouble()
    }

    override fun perimeter(): Double {
        val perimeter = width + height + width + height
        return perimeter.toDouble()
    }
}

class Circle(override val color: String, val radius: Int) : Figure(color) {
    override fun square(): Double {
        val square = radius * radius * 3.14
        return square
    }

    override fun perimeter(): Double {
        val perimeter = 2 * 3.14 * radius
        return perimeter
    }
}