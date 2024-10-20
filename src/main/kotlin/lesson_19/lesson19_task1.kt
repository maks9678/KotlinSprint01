package org.example.lesson_19

fun main() {
    println("доступные рыбы:")
    for (i in Fish.values()) {
        println(i)
    }
}

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH
}

fun setFish(fish: Fish) {
    when (fish) {
        Fish.GUPPY -> println("гуппи")
        Fish.ANGELFISH -> println("скалярия")
        Fish.GOLDFISH -> println("золотая рыбка")
        Fish.SIAMESE_FIGHTING_FISH -> println("петушок")
    }
}