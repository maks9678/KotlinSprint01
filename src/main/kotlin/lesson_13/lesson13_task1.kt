package org.example.lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory(readln(), readln().toLong(), readln())
}

class PhoneDirectory(val name: String, val phoneNumber: Long, val company: String?) {
}