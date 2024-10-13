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

interface Flying {
    fun fly()
}

interface Floating {
    fun swim()
}

class Crucian : Floating {
    override fun swim() {
        println("карась плавает")
    }
}

class Gull : Flying {
    override fun fly() {
        println("чайка летает")
    }
}

class Duck : Flying, Floating {
    override fun fly() {
        println("утка летает")
    }

    override fun swim() {
        println("утка плавает")
    }
}