package org.example.lesson_22

data class MainScreenState(
    var data: String,
    var isLoading: Boolean = false,
) {
    fun loadData() {
        var currentState = this.copy("отсутствие данных")
        println("Текущее состояние: ${currentState.data}, загрузка: ${currentState.isLoading}")

        currentState = currentState.copy("загрузка данных", true)
        println("Текущее состояние: ${currentState.data}, загрузка: ${currentState.isLoading}")

        currentState = currentState.copy("наличие загруженных данных", false)
        println("Текущее состояние: ${currentState.data}, загрузка: ${currentState.isLoading}")
    }
}

class MainScreenViewModel(var mainScreenState: MainScreenState) {}

fun main() {
    val mainScreenState = MainScreenState("отсутствие данных")

    val viewModel = MainScreenViewModel(mainScreenState)
    viewModel.mainScreenState.loadData()
}