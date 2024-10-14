package org.example.lesson_15

fun main() {
    val tools1 = Tool("Гитара", 22)
    tools1.printShowInfo()
    val accessories1 = Accessories("Струна", 50)
    accessories1.printShowInfo()

    tools1.findAccessories(accessories1)
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

class Tool(name: String, quantityInStock: Int) : Product(name, quantityInStock) {
    fun printShowInfo() {
        println("Инструмент: $name, Количество на складе: $quantityInStock")
    }

    fun findAccessories(accessory: Accessories) {
        println("Ищем комплектующие для инструмента: ${accessory.name}")
        accessory.search()
    }
}

class Accessories(name: String, quantityInStock: Int) : Product(name, quantityInStock), Search {
    fun printShowInfo() {
        println("Комплектующее: $name, Количество на складе: $quantityInStock ")
    }
}