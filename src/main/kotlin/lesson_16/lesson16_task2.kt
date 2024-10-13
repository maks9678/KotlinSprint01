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
//Создай класс, описывающий круг.
// У него должны быть методы, вычисляющие длину окружности и площадь круга, используя радиус.
//Число Pi должно быть равным 3.14, быть недоступным в других файлах и защищенным от изменений извне.
// Радиус передается через конструктор и не виден из внешнего по отношению к классу кода.
//Создай объект, вызови у него методы для расчета окружности и площади и выведи данные в консоль.