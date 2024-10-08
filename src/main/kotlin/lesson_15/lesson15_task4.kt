package org.example.lesson_15

fun main() {
    val tools1 = Tools("Гитара", 22)
    tools1.infoAvailability()
    val accessories1 = Accessories("Струна", 50)
    accessories1.infoAvailability()

    tools1.findAccessories(accessories1)
}

interface Search {
    fun search() {
        println("Выполняется поиск ")
    }
}

abstract class ToolsAndAccessories(
    val name: String,
    val quantityInStock: Int,
) {
    abstract fun infoAvailability()
}

class Tools(name: String, quantityInStock: Int) : ToolsAndAccessories(name, quantityInStock) {
    override fun infoAvailability() {
        println("Инструмент: $name, Количество на складе: $quantityInStock")
    }

    fun findAccessories(accessory: Accessories) {
        println("Ищем комплектующие для инструмента: ${accessory.name}")
        accessory.search()
    }
}

class Accessories(name: String, quantityInStock: Int) : ToolsAndAccessories(name, quantityInStock), Search {
    override fun infoAvailability() {
        println("Комплектующее: $name, Количество на складе: $quantityInStock ")
    }
}