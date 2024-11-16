package org.example.lesson_12

fun main() {
    val dailyWeatherData1 = DailyWeatherDataV2(20, 15, true)
    val dailyWeatherData2 = DailyWeatherDataV2(30, 5, false)
    dailyWeatherData1.weatherPrintout()
    dailyWeatherData2.weatherPrintout()
}

class DailyWeatherDataV2(
    val daytimeTemperature: Int,
    val nightTemperature: Int,
    val isPrecipitation: Boolean,
) {

    fun weatherPrintout() {
        println("$daytimeTemperature\n$nightTemperature\n$isPrecipitation")
    }
}