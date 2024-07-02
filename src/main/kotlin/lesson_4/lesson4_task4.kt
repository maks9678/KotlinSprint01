package org.example.lesson_4

fun main() {

    val trainingDay = 5

    val trainingDeterminant = 5 % 2 == 0

    println(
        """
            Упражнения для рук: ${!trainingDeterminant} 
            Упражнения для ног: ${trainingDeterminant}
            Упражнения для спины: ${trainingDeterminant}
            Упражнения для пресса: ${!trainingDeterminant}""".trimIndent()
    )

}