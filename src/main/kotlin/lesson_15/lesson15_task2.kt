package org.example.lesson_15

fun main() {
    val temperature1 = Temperature(-15)
    val precipitationAmount1 = PrecipitationAmount(20)
    val weatherServer = WeatherServer()
    weatherServer.send(temperature1)
    weatherServer.send(precipitationAmount1)

}

abstract class WeatherStationStats()

class Temperature(val temperature: Int) : WeatherStationStats()
class PrecipitationAmount(val precipitationAmount: Int) : WeatherStationStats()

class WeatherServer {
    fun send(i: WeatherStationStats) {
        when (i) {
            is Temperature -> sendTemperature(i.temperature)
            is PrecipitationAmount -> sendPrecipitationAmount(i.precipitationAmount)
        }
    }

    fun sendTemperature(temperature: Int) {
        println("Отправка температуры: $temperature C")
    }

    fun sendPrecipitationAmount(precipitationAmount: Int) {
        println("Отправка количества осадков: $precipitationAmount мм")
    }
}