package org.example.lesson_14

fun main() {
    val shipliner1 = ShipLiner2(
        "круизный лайнер 1",
        20, 100000, 24000
    )
    shipliner1.vehicleData()
    shipliner1.loading()

    val cargoShip1 = CargoShip2(
        "Сухогруз 1", 15, 400000,
        300, 200000
    )
    cargoShip1.vehicleData()
    cargoShip1.loadingOfHolds()
    cargoShip1.loading()

    val icebreaker1 = Icebreaker2(
        "Ледокол 1", 12,
        200000, 200
    )
    icebreaker1.vehicleData()
    icebreaker1.loading()
}

open class ShipLiner2(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val numberOfPassengers: Int,
) {
    open fun vehicleData() {
        println(
            "Название корабля : $name \n" +
                    "Скорость корабля : $speed \n" +
                    "Грузоподъемность колебля : $loadCapacity \n" +
                    "Количество пассажиров : $numberOfPassengers \n"
        )
    }

    open fun loading() {
        println("лайнер выдвигает горизонтальный трап со шкафута")
    }
}

class CargoShip2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
    val workload: Int,
) : ShipLiner2(name, speed, loadCapacity, numberOfPassengers) {
    fun loadingOfHolds() {
        println("погрузка трюмов")
    }

    override fun vehicleData() {
        println(
            "Название корабля : $name \n" +
                    "Скорость корабля : $speed \n" +
                    "Грузоподъемность колебля : $loadCapacity \n" +
                    "Количество пассажиров : $numberOfPassengers \n" +
                    "Заполненность трюмов : $workload \n"
        )
    }

    override fun loading() {
        println("грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker2(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
    var isIcebreakerMode: Boolean = false,
) : ShipLiner2(name, speed, loadCapacity, numberOfPassengers) {
    override fun loading() {
        println("ледокол открывает ворота со стороны кормы")
    }

    override fun vehicleData() {
        println(
            "Название корабля : $name \n" +
                    "Скорость корабля : $speed \n" +
                    "Грузоподъемность колебля : $loadCapacity \n" +
                    "Количество пассажиров : $numberOfPassengers \n" +
                    "Активен режим ледокола : $isIcebreakerMode \n"
        )
    }
}