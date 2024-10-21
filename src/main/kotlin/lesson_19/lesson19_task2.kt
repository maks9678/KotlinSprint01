package org.example.lesson_19

fun main() {
    val product1 = Product("куртка", 2, TypeProduct.CLOTHES)
    val product2 = Product("скотч", 3, TypeProduct.STATIONERY)
    val product3 = Product("жвачка", 4, TypeProduct.MISCELLANEA)

    product1.infoProduct()
    product2.infoProduct()
    product3.infoProduct()
}

enum class TypeProduct {
    CLOTHES,
    STATIONERY,
    MISCELLANEA;

    fun getCategoryName(): String {
        return when (this) {
            CLOTHES -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEA -> "Разное"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: TypeProduct,
) {
    fun infoProduct() {
        println("Товар: $name - Категория: ${category.getCategoryName()}")
    }
}