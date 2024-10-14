package org.example.lesson_15

fun main() {
    val lorry1 = Lorry(0, 1, 0, 2)
    val car1 = Car(0, 3)

    car1.loadPassengers(3)
    lorry1.loadPassengers(1)
    lorry1.loadCargo(2)

    lorry1.transfer()
    car1.transfer()

    lorry1.unloadCargo()
    lorry1.unloadPassengers()
    car1.unloadPassengers()

    car1.transfer()
    car1.loadPassengers(2)
    car1.transfer()
    car1.unloadPassengers()
}

interface MovingCar {
    fun transfer() = println("перемещение")
}

interface TransportPassengers {
    fun loadPassengers(loadPassengers: Int)

    fun unloadPassengers()
}

interface CargoTransportation {
    fun loadCargo(loadCargo: Int)

    fun unloadCargo()
}

class Lorry(
    private var currentNumberOfPeople: Int,
    private val maxPassengers: Int,
    private var currentCargoQuantity: Int,
    private val maxLoadCapacity: Int,
) : MovingCar, TransportPassengers, CargoTransportation {

    override fun loadPassengers(loadPassengers: Int) {
        if ((currentNumberOfPeople + loadPassengers) <= maxPassengers) {
            println("загружено $loadPassengers пассажиров ")
            currentNumberOfPeople += loadPassengers
        } else println("перегрузка пассажиров")
    }

    override fun unloadPassengers() {
        println("выгрузка $currentNumberOfPeople  пассажиров")
        currentNumberOfPeople = 0
    }

    override fun loadCargo(loadCargo: Int) {
        if ((currentCargoQuantity + loadCargo) <= maxLoadCapacity) {
            println("загружено $loadCargo тонн груза ")
            currentCargoQuantity += loadCargo
        } else println("перегрузка тонн груза")
    }

    override fun unloadCargo() {
        println("выгрузка $currentCargoQuantity  тонн груза")
        currentCargoQuantity = 0
    }
}

class Car(
    private var currentNumberOfPeople: Int,
    private val maxPassengers: Int,
) : MovingCar, TransportPassengers {

    override fun loadPassengers(loadPassengers: Int) {
        if ((currentNumberOfPeople + loadPassengers) <= maxPassengers) {
            println("загружено $loadPassengers пассажиров ")
            currentNumberOfPeople += loadPassengers
        } else println("перегрузка пассажиров")
    }

    override fun unloadPassengers() {
        println("выгрузка $currentNumberOfPeople  пассажиров")
        currentNumberOfPeople = 0
    }
}