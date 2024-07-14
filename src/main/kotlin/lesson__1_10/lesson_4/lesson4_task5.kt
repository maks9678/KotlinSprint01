package org.example.lesson__1_10.lesson_4

const val IS_DAMAGED_SHIP = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val BOXES_OF_PROVISIONS = 50
const val IS_FAVORABLE_WEATHER = false

const val IS_DAMAGED_SHIP_OTHER = true
const val NUMBER_OF_CREW_OTHER = 70
const val BOXES_OF_PROVISIONS_OTHER = 50
const val IS_FAVORABLE_WEATHER_OTHER = true

fun main() {

    println("Наличие повреждений корпуса")
    val isDamagedShipNow = readln().toBoolean()
    println("Текущий состав экипажа")
    val numberOfCrewNow = readln().toInt()
    println("Количество ящиков с провизией на борту")
    val boxesOfProvisionsNow = readln().toInt()
    println("Благоприятность метеоусловий")
    val isFavorableWeatherNow = readln().toBoolean()

    val isTheShipCanSail = (((isDamagedShipNow == IS_DAMAGED_SHIP) ||
            (!isDamagedShipNow == IS_DAMAGED_SHIP)) &&
            ((numberOfCrewNow >= MIN_NUMBER_OF_CREW) &&
                    (numberOfCrewNow <= MAX_NUMBER_OF_CREW)) &&
            (boxesOfProvisionsNow > BOXES_OF_PROVISIONS) &&
            (isFavorableWeatherNow == IS_FAVORABLE_WEATHER)) ||
            ((isDamagedShipNow == IS_DAMAGED_SHIP_OTHER) &&
                    (numberOfCrewNow == NUMBER_OF_CREW_OTHER) &&
                    (boxesOfProvisionsNow >= BOXES_OF_PROVISIONS_OTHER) &&
                    (isFavorableWeatherNow == IS_FAVORABLE_WEATHER_OTHER))

    println("Корабль может отправлятся : $isTheShipCanSail")
}