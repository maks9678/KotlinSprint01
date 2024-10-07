package org.example.lesson_15

fun main() {
    val crucian = Crucian()
    val gull = Gull()
    val dick = Duck()

    crucian.swim()
    gull.fly()
    dick.fly()
    dick.swim()
}

interface FlyingCreatures {
    fun fly() {
    }
}

interface FloatingCreatures {
    fun swim() {
    }
}

class Crucian : FloatingCreatures {
    override fun swim() {
        println("карась плавает")
    }
}

class Gull : FlyingCreatures {
    override fun fly() {
        println("чайка летает")
    }
}

class Duck : FlyingCreatures, FloatingCreatures {
    override fun fly() {
        println("утка летает")
    }

    override fun swim() {
        println("утка плавает")
    }
}