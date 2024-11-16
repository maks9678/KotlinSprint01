package org.example.lesson_18

fun main() {
    val order1 = Order(1, "кроссовки")
    val order2 = Order(2, listOf("футболка", "ласты", "пляжный зонт"))
    order1.printInfo()
    order2.printInfo()
}

class Order(
    val numberOrder: Int,
    val product: Any,
) {
    fun printInfo() {
        if (product is String) println("Заказан товар: $product")
        else if (product is List<*>) println("Заказаны следующие товары: $product")
    }
}