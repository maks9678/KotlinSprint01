package org.example.lesson_17

fun main() {
    val package1 = Package(1, "Казань")
    package1.currentLocation = "Москва"
    println("проехали п промежуточный пункт ${package1.numberMovements}")
    package1.currentLocation = "Минск"
    println("проехали п промежуточный пункт ${package1.numberMovements}")
}

class Package(
    val number: Int,
    currentLocation: String,
) {
    var numberMovements: Int = 1
    var currentLocation = currentLocation
        set(value) {
            field = value
            numberMovements++
        }
}