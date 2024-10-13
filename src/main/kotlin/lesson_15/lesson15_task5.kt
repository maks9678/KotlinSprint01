package org.example.lesson_15

fun main() {
    val lorry1 = Lorry(0, 1, 0, 2)
    val car1 = Car(0, 3)

    car1.loadingPassengers(3)
    lorry1.loadingPassengers(1)
    lorry1.loadingCargo(2)

    lorry1.transport()
    car1.transport()

    lorry1.unloadingCargo()
    lorry1.unloadingPassengers()
    car1.unloadingPassengers()

    car1.transport()
    car1.loadingPassengers(2)
    car1.transport()
    car1.unloadingPassengers()
}

interface MovementOfCars {
    fun transport() {

    }
}

interface TransportationOfPassengers {
    fun loadingPassengers(loadPassengers: Int)

    fun unloadingPassengers()
}

interface CargoTransportation {
    fun loadingCargo(loadCargo: Int)

    fun unloadingCargo()
}


class Lorry(
    private var currentNumberOfPeople: Int,
    private val maxPassengers: Int,
    private var currentCargoQuantity: Int,
    private val maxLoadCapacity: Int,
) : MovementOfCars, TransportationOfPassengers, CargoTransportation {

    override fun loadingPassengers(loadPassengers: Int) {
        if ((currentNumberOfPeople + loadPassengers) <= maxPassengers) {
            println("загружено $loadPassengers пассажиров ")
            currentNumberOfPeople += loadPassengers
        } else println("перегрузка пассажиров")
    }

    override fun unloadingPassengers() {
        println("выгрузка $currentNumberOfPeople  пассажиров")
        currentNumberOfPeople = 0
    }

    override fun loadingCargo(loadCargo: Int) {
        if ((currentCargoQuantity + loadCargo) <= maxLoadCapacity) {
            println("загружено $loadCargo тонн груза ")
            currentCargoQuantity += loadCargo
        } else println("перегрузка тонн груза")
    }

    override fun unloadingCargo() {
        println("выгрузка $currentCargoQuantity  тонн груза")
        currentCargoQuantity = 0
    }
}

class Car(
    private var currentNumberOfPeople: Int,
    private val maxPassengers: Int,
) : MovementOfCars, TransportationOfPassengers {

    override fun loadingPassengers(loadPassengers: Int) {
        if ((currentNumberOfPeople + loadPassengers) <= maxPassengers) {
            println("загружено $loadPassengers пассажиров ")
            currentNumberOfPeople += loadPassengers
        } else println("перегрузка пассажиров")
    }

    override fun unloadingPassengers() {
        println("выгрузка $currentNumberOfPeople  пассажиров")
        currentNumberOfPeople = 0
    }
}