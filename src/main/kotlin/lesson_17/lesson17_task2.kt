package org.example.lesson_17

fun main() {
    val ship1 = Ship("катер", 15, "хабаровск")
    ship1.name = "лодка"
    println(
        "имя :${ship1.name},\t" +
                " средняя скорость : ${ship1.averageSpeed}, \t" +
                "порт приписки : ${ship1.portRegistry}"
    )
}

class Ship(
    private val _name: String,
    var averageSpeed: Int,
    var portRegistry: String,
) {
    var name: String = _name
        set(value) = println("имя не изменить ")
}