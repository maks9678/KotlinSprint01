package org.example.lesson_13

fun main() {
    val phoneDirectory = PhoneDirectory(readln(), readln(), readln())
}

class PhoneDirectory(val name: String, val phoneNumber: String, val company: String?) {
}