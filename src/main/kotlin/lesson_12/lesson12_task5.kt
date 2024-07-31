package org.example.lesson_12

import kotlin.random.Random


const val KELVIN_TO_CELSIUS = 273
fun main() {
    val monthlyWeatherData: Array<Int> = arrayOf()
    for (i in 1..30) {
        val daytimeTemperatureRandom:Int = (-15.. 36).random()
        val nightTemperatureRandom:Int = (-15.. 20).random()
        val isPrecipitationRandom = Random.nextBoolean()
        monthlyWeatherData.add(
            DailyWeatherDataV5(
                daytimeTemperatureRandom,
                nightTemperatureRandom,
                isPrecipitationRandom
            )
    }
}

fun random(i: Int, i1: Int) {

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
//
//Продолжи усовершенствовать программу, теперь
// она должна рассчитывать средние значения температур и считать количество дней с осадками за месяц.
//
//Представь, что данные ты получаешь от датчиков. Сымитируй их поведение с помощью random.
//
//- в функции main() создай список и добавь в него с помощью цикла 30 объектов класса,
// передав в конструкторы случайные значения;
//- сохрани в отдельные списки дневные и ночные температуры, а также список дней с осадками;
//- вычисли средние значения дневных и ночных температур с помощью специальной extension-функции
// из стандартной библиотеки;
//- посчитай количество дней с осадками.
//
//Выведи результаты в консоль.