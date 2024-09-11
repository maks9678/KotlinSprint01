package org.example.lesson_12

import kotlin.random.Random


const val KELVIN_TO_CELSIUS = 273
fun main() {
    val monthlyWeatherData = mutableListOf<DailyWeatherDataV5>()

    for (i in 1..30) {
        val daytimeTemperatureRandom: Int = (-15..36).random()
        val nightTemperatureRandom: Int = (-15..20).random()
        val isPrecipitationRandom = Random.nextBoolean()
        monthlyWeatherData.add(
            DailyWeatherDataV5(
                daytimeTemperatureRandom,
                nightTemperatureRandom,
                isPrecipitationRandom,
            )
        )
    }
    var monthlyWeatherDataDayTime = monthlyWeatherData.subList(0, 30)
    var monthlyWeatherDataNight = monthlyWeatherData.subList(31, 60)
    var monthlyWeatherDataPrecipitation = monthlyWeatherData.subList(61, 90)
    val averageDaytimeTemperatures: Double = monthlyWeatherDataDayTime.average()
    val averageNightTemperatures: Double = monthlyWeatherDataNight.average()
    var daysWithPrecipitation: Int = 0
    for (i in monthlyWeatherDataPrecipitation) {
        if (i.toBoolean() == true) {
            daysWithPrecipitation++
        }
    }

    println("Средняя дневная температура $averageDaytimeTemperatures")
    println("Средняя ночная температура $averageNightTemperatures")
    println("Количество дней с осадками $daysWithPrecipitation")
}

class DailyWeatherDataV5(
    _daytimeTemperature: Int,
    _nightTemperature: Int,
    _isPrecipitation: Boolean,
) {
    var daytimeTemperature = _daytimeTemperature - KELVIN_TO_CELSIUS
    var nightTemperature = _nightTemperature - KELVIN_TO_CELSIUS
    var isPrecipitation = _isPrecipitation
    fun weatherPrintout() {
        println("$daytimeTemperature\n$nightTemperature\n$isPrecipitation")
    }

    init {
        weatherPrintout()
    }
}