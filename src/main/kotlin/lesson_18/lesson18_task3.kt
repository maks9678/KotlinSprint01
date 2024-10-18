package org.example.lesson_18

fun main() {
    val fox1 = Fox("Рита")
    val dog1 = Dog("Шон")
    val cat1 = Cat("Шамиль")
    val arrayMammal = arrayOf<Mammal>(fox1, dog1, cat1)
    arrayMammal.forEach { it.eut() }
}

open class Mammal(open val name: String) {
    open fun eut() {}
    fun sleep() {
        println("$name спит")
    }
}

class Fox(override val name: String) : Mammal(name) {
    override fun eut() {
        println("$name ест ягоды")
    }
}

class Dog(override val name: String) : Mammal(name) {
    override fun eut() {
        println("$name ест кости")
    }
}

class Cat(override val name: String) : Mammal(name) {
    override fun eut() {
        println("$name ест рыбу")
    }
}