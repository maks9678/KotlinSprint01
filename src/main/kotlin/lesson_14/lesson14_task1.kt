package org.example.lesson_14

open class ShipTypeLiner(
    val name: String,
    val speed: Int,
    val loadCapacity: Int,
    val numberOfPassengers: Int,
) {
}

class Cargo(
    name: String,
    speed: Int,
    loadCapacity: Int,
    numberOfPassengers: Int,
    val volumeOfHolds: Int,
) : ShipTypeLiner(name, speed, loadCapacity, numberOfPassengers) {
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
) : ShipTypeLiner(name, speed, loadCapacity, numberOfPassengers) {
    fun аctivateIcebreaker() {
        isIcebreakerMode = true
        println("активирован режим ледокола")
    }

    fun deаctivateIcebreaker() {
        isIcebreakerMode = false
        println("деактивирован режим ледокола")
    }
}
//Задача 1 к Уроку 14
//
//В компьютерной игре есть три типа кораблей: лайнер, грузовой и ледокол. Все корабли построены на основе лайнера, но у каждого свой функционал и дополнительные свойства.
//
//У грузовых скорость меньше, а грузоподъемность больше. У ледоколов ниже и скорость, и вместительность, но они могут колоть лёд. Лайнер может вмещать наибольшее количество пассажиров.
//
//- спроектируй иерархию классов со значениями по умолчанию для каждого типа корабля;
//- создай по 1 экземпляру каждого типа корабля.