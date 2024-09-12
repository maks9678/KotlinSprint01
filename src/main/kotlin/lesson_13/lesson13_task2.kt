package org.example.lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory2(readln(), readln(), readln())
    phoneDirectory.printDirectory()
}

class PhoneDirectory2(_name: String, _phoneNumber: String, val _company: String? = null) {
    val name = _name
    val phoneNumber = _phoneNumber
    var company = _company ?: "не указано"
    fun printDirectory() {
        println(
            "- Имя: $name\n" +
                    "- Номер: $phoneNumber\n" +
                    "- Компания: $company"
        )
    }
}