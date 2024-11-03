package org.example.lesson_20

fun main() {
    val robot1 = Robot()
    robot1.say()
    robot1.setModifier { phrase -> invert(phrase) }
    robot1.say()
}

fun invert(phrase: String): String = phrase.split("").reversed().joinToString { " " }

class Robot {
    var modifier: (String) -> String = { it }
    val phrases = listOf(
        "Привет, мир!",
        "Как дела?",
        "Сегодня прекрасный день!",
        "Я робот!",
        "Выполняю задачи."
    )

    fun say() {
        val phrasesPrint = phrases.random()
        println(modifier(phrasesPrint))
    }

    fun setModifier(newModifier: (String) -> String) {
        modifier = newModifier
    }
}