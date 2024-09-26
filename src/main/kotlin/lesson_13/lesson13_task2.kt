package org.example.lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory2(readln(), readln().toLong(), readln())
    phoneDirectory.printDirectory()
}

class PhoneDirectory2(val name: String, val phoneNumber: Long, val company: String? = null ?: "не указано") {
    fun printDirectory() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: $company"
        )
    }
}