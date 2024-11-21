package org.example.lesson_21

fun main() {
    val experience = mapOf("Сила" to 6, "Ловкость" to 4, "Интеллект" to 6)
    experience.maxCategory()
    println("Навык с наибольшим количеством очков опыта: ${experience.maxCategory()}")
}

fun Map<String, Int>.maxCategory(): String {
    var maxNumber = 0
    var maxKey = ""
    for ((key, value) in this) {
        if (maxNumber < value) {
            maxNumber = value
            maxKey = key
        }
    }
    return maxKey
}