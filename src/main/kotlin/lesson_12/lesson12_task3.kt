package org.example.lesson_12

const val KELVIN_TO_CELSIUS = 273
fun main() {
    val dailyWeatherData1 = DailyWeatherDataV3(276, 270, true)
    val dailyWeatherData2 = DailyWeatherDataV3(285, 280, false)
    dailyWeatherData1.weatherPrintout()
    dailyWeatherData2.weatherPrintout()
}

class DailyWeatherDataV3(
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
}