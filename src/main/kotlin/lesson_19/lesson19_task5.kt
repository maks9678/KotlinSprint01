package org.example.lesson_19

fun main() {
    val cardIndex = mutableListOf<Human>()
    println("Введите имя и через Enter пол")
    for (i in 1..7) {
        print("Введите имя :")
        val name = readln()
        print("Введите пол (man или women):")
        val genderInput = readln()

        val gender = when (genderInput) {
            Gender.MAN._gender -> Gender.MAN
            Gender.WOMAN._gender -> Gender.WOMAN
            else -> {
                println("Некорректный ввод пола. Попробуйте снова.")
                continue
            }
        }
        val human = Human(name, gender)
        cardIndex.add(human)

        if (cardIndex.size % 5 == 0)
            println("Текущие записи:")
        cardIndex.forEach { println("имя:${it.name} ,пол: ${it.genderHuman}") }

    }
}

enum class Gender(val _gender: String) {
    MAN("man"),
    WOMAN("women"),
}

class Human(val name: String, val genderHuman: Gender)