package org.example.lesson_16

fun main() {
    val order1 = Order(1, "собирается")
    order1.sendManager("в пути")
}

class Order(
    private val numberOrder: Int,
    var statusOrder: String,
) {
    private fun changeStatus(newStatus: String) {
        var statusOrder = newStatus
    }

    fun sendManager(newStatus: String) {
        changeStatus(newStatus)

    }
}