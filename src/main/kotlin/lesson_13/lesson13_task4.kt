package org.example.lesson_13

fun main() {
    val phoneDirectory = mutableListOf<PhoneDirectory4>()

    while (true) {
        if (!addContact(phoneDirectory)) break
    }
    println("Телефонная книга:")
    phoneDirectory.forEach { it.printDirectory() }
}

fun addContact(phoneDirectory: MutableList<PhoneDirectory4>): Boolean {
    println("Введите имя :")
    val name = readln()
    println("Введите номер телефона:")
    val phoneNumberInput = readln()
    val phoneNumber = phoneNumberInput.toLongOrNull()

    if (phoneNumber == null) {
        println("Номер телефона введен некорректно. Запись не добавлена.")
        return false
    }

    println("Введите компанию:")
    val company = readln().ifEmpty { null }
    val contact = PhoneDirectory4(name, phoneNumber, company)
    phoneDirectory.add(contact)

    println("Запись добавлена: $name")
    return true
}

class PhoneDirectory4(
    val name: String,
    val phoneNumber: Long,
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