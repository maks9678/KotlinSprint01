package org.example.lesson_15

fun main() {
    val tools1 = Tool("Гитара", 22)
    tools1.printAvailabilityInfo()
    val accessories1 = Accessories("Струна", 50)
    accessories1.printShowInfo()

    tools1.search()
}

interface Search {
    fun search() {
        println("Выполняется поиск ")
    }
}

abstract class Product(
    val name: String,
    val quantityInStock: Int,
)

class Tool(name: String, quantityInStock: Int) : Product(name, quantityInStock),Search {
    fun printAvailabilityInfo() {
        println("Инструмент: $name, Количество на складе: $quantityInStock")
    }
}

class Accessories(name: String, quantityInStock: Int) : Product(name, quantityInStock){
    fun printShowInfo() {
        println("Комплектующее: $name, Количество на складе: $quantityInStock ")
    }
}