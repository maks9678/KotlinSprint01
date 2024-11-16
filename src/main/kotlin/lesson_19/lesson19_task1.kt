package org.example.lesson_19

fun main() {
    println("доступные рыбы:")
    Fish.entries.forEach { fish ->
        println(fish.nameFish)
    }
}

enum class Fish(val nameFish: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок")
}