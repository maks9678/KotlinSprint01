package org.example.lesson_12

import kotlin.random.Random

const val KELVIN_TO_CELSIUS = 273

fun main() {
    val monthlyWeatherData = mutableListOf<DailyWeatherDataV5>()
    for (i in 1..30) {
        monthlyWeatherData.add(
            DailyWeatherDataV5(
                (-15..36).random(),
                (-15..20).random(),
                Random.nextBoolean(),
            )
        )
    }

    val monthlyWeatherDataDayTime = monthlyWeatherData.subList(0, 30)
    val averageDaytimeTemperatures = monthlyWeatherData.sumOf { it.daytimeTemperature } / monthlyWeatherData.size
    val averageNightTemperatures = monthlyWeatherData.sumOf { it.nightTemperature } / monthlyWeatherData.size
    val daysWithPrecipitation = monthlyWeatherData.count { it.isPrecipitation }

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
        println(
            "Дневная температура: $daytimeTemperature\n" +
                    "Ночная температура: $nightTemperature\n" +
                    "Осадки: $isPrecipitation"
        )
    }

    init {
        weatherPrintout()
    }
}