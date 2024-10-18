package org.example.lesson_18
fun main() {
    val screen = Screen()
    val circle = Circle("MyCircle", 1.0f, 2.0f)
    val square = Square("MySquare", 3.0f, 4.0f)
    val dot = Dot("MyDot", 5.0f, 6.0f)

    screen.draw(circle)
    screen.draw(square)
    screen.draw(dot)

    screen.draw("MyCustomFigure", 7, 8)
    screen.draw("MyCustomFigure", 1.5f, 2.5f)
}
abstract class Figure(
    val name:String,
    val x :Float,
    val y :Float,
)
class Circle(name: String, x: Float, y: Float):Figure(name, x, y)
class Square(name: String, x: Float, y: Float):Figure(name, x, y)
class Dot(name: String, x: Float, y: Float):Figure(name, x, y)
class Screen{
    fun draw(circle: Circle){
        println("Нарисована фигура $circle")
    }
    fun draw(square: Square){
        println("Нарисована фигура $square")
    }
    fun draw(dot: Dot){
        println("Нарисована фигура $dot")
    }
    fun draw(name: String, x: Int, y: Int) {
        println("Drawing a figure named '$name' at integer coordinates ($x, $y)")
    }

    fun draw(name: String, x: Float, y: Float) {
        println("Drawing a figure named '$name' at float coordinates ($x, $y)")
    }
}
//В приложении есть экран. Мы можем рисовать в нем разные объекты, указывая координаты (x, y) и сам объект.
// Объектами выступают круг, квадрат и точка. Координаты могут быть как Int, так и Float.
//Реализуй классы точки, квадрата и круга, а также класс Screen со всеми перегруженными методами draw(...).