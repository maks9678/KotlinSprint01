package org.example.lesson_12

fun main() {
    val dailyWeatherData1 = DailyWeatherData()
    val dailyWeatherData2 = DailyWeatherData()
    dailyWeatherData1.daytimeTemperature = 20
    dailyWeatherData1.nightTemperature = 10
    dailyWeatherData1.isPrecipitation = true
    dailyWeatherData2.daytimeTemperature = 30
    dailyWeatherData2.nightTemperature = 5
    dailyWeatherData2.isPrecipitation = false

    println(dailyWeatherData1)
}

class DailyWeatherData(
) {
    var daytimeTemperature = 15
    var nightTemperature = 15
    var isPrecipitation = false
}