package org.example.lesson__1_10.lesson_5

fun main() {

    val number1 = 4
    val number2 = 5

    println("Введите первое число от 0 до 42:")
    val userNumber1 = readLine()!!.toInt()
    println("Введите второе число от 0 до 42:")
    val userNumber2 = readLine()!!.toInt()

    if ((number1 == userNumber1 || number1 == userNumber2) && (number2 == userNumber1 || number2 == userNumber2)) {
        println("Поздравляем! Вы выиграли главный приз!")
    } else if ((number1 == userNumber1 || number1 == userNumber2) || (number2 == userNumber1 || number2 == userNumber2)) {
        println("Вы выиграли утешительный приз!")
        println("Победные числа $number1 и $number2")
    } else {
        println("Неудача!")
        println("Победные числа $number1 и $number2")
    }

}