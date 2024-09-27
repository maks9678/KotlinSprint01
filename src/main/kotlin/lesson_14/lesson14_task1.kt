package org.example.lesson_14

fun main() {
    val shipliner1 = ShipLiner(
        "круизный лайнер 1",
        20, 100000, 24000
    )
    val cargoShip1 = CargoShip(
        "Сухогруз 1", 15, 400000,
        300, 200000
    )
    cargoShip1.loadingOfHolds()

    val icebreaker1 = Icebreaker(
        "Ледокол 1", 12,
        200000, 200
    )
    icebreaker1.аctivateIcebreaker()
    icebreaker1.deаctivateIcebreaker()
}

open class ShipLiner(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val numberOfPassengers: Int,
)

class CargoShip(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
    val workload: Int,
) : ShipLiner(name, speed, loadCapacity, numberOfPassengers) {
    fun loadingOfHolds() {
        println("погрузка трюмов")
    }
}

class Icebreaker(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
    var isIcebreakerMode: Boolean = false,
) : ShipLiner(name, speed, loadCapacity, numberOfPassengers) {
    fun аctivateIcebreaker() {
        isIcebreakerMode = true
        println("активирован режим ледокола")
    }

    fun deаctivateIcebreaker() {
        isIcebreakerMode = false
        println("деактивирован режим ледокола")
    }
}