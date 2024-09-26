package org.example.lesson_13

fun main() {
    val phoneDirectory = mutableListOf<PhoneDirectory5>()
    println("Телефонная книга:")
    phoneDirectory.forEach { it.printDirectory() }
}

fun addContact(phoneDirectory: MutableList<PhoneDirectory5>): Boolean {
    println("Введите имя :")
    val name = readln()
    println("Введите номер телефона:")
    val phoneNumberInput = readln()
    try {
        val phoneNumber = phoneNumberInput.toLong()
    } catch (e: NumberFormatException) {
        println("Номер телефона введен некорректно: ${e.message}")
        return false
    }
    println("Введите компанию:")
    val company = readln().ifEmpty { null }
    val contact = PhoneDirectory5(name, phoneNumberInput, company)
    phoneDirectory.add(contact)

    println("Запись добавлена: $name")
    return true
}

class PhoneDirectory5(
    val name: String,
    val phoneNumber: String,
    val company: String? = null,
) {
    fun printDirectory() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: ${company ?: "не указано"}"
        )
    }
}