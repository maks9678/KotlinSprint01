package org.example.lesson_4

fun main() {

    val damage = false
    val numberOfCrew = 55..70
    val provisions = 50
    val weather = false

    val alternativeDamage = true
    val alternativeNumberOfCrew = 70
    val alternativeProvisions = 50
    val alternativeWeather = true

    println("Наличие повреждений корпуса")
    val nowDamage = readLine()!!.toBoolean()
    println("Текущий состав экипажа")
    val nowNumberOfCrew = readLine()!!.toInt()
    println("Количество ящиков с провизией на борту")
    val nowProvisions = readLine()!!.toInt()
    println("Благоприятность метеоусловий")
    val nowWeather = readLine()!!.toBoolean()

    val conclusion = (((nowDamage == damage) || (!nowDamage == damage)) && (nowNumberOfCrew in numberOfCrew) && (nowProvisions > provisions) && (nowWeather == weather)) ||
            ((nowDamage == alternativeDamage) && (nowNumberOfCrew == nowNumberOfCrew) && (nowProvisions >= alternativeProvisions) && (nowWeather == alternativeWeather))

    println(conclusion)
}
