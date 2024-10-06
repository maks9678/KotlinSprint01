package org.example.lesson_14

fun main() {
    val planet1 = Planet("юпитер", true)
    val sputnik1 = Sputnik("S1")
    val sputnik2 = Sputnik("S2")

    planet1.addSputnik(sputnik1)
    planet1.addSputnik(sputnik2)

    planet1.printInfo()
}

abstract class CelestialBodies(
    open val name: String,
    open val isSuitableForDisembarkation: Boolean,
    open val isSuitableAtmosphere: Boolean,
)

class Planet(
    override val name: String,
    override var isSuitableForDisembarkation: Boolean = false,
    override var isSuitableAtmosphere: Boolean = false,
) : CelestialBodies(name, isSuitableForDisembarkation, isSuitableAtmosphere) {

    val listSputnik = mutableListOf<Sputnik>()

    fun addSputnik(it: Sputnik) {
        listSputnik.add(it)
    }

    fun printInfo() {
        println("Планета: $name")
        println("Спутники:")
        listSputnik.forEach { println(it.name) }
    }
}

class Sputnik(
    override val name: String,
    override val isSuitableForDisembarkation: Boolean = false,
    override val isSuitableAtmosphere: Boolean = false,
) : CelestialBodies(name, isSuitableForDisembarkation, isSuitableAtmosphere)