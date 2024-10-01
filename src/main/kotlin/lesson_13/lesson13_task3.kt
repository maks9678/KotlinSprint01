package org.example.lesson_13

fun main() {
    val phoneDirectory = mutableListOf(
        PhoneDirectory3("Олег", 89782211221, "Тинькофф"),
        PhoneDirectory3("null", 89782211222, null),
        PhoneDirectory3("Влад", 89782211223, null),
        PhoneDirectory3("Милана", 879782211224, "Яндекс"),
        PhoneDirectory3("Гарик", 89782211225, "Reddit")
    )
    val contactsWithCompanies = phoneDirectory.mapNotNull {
        if (it.company != null) it else null
    }
    contactsWithCompanies.forEach { contact -> contact.printDirectory() }
}

class PhoneDirectory3(
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