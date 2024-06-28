package org.example.lesson_2

fun main() {
    val student1 = 3
    val student2 = 4
    val student3 = 3
    val student4 = 5

    var totalStudent = 4

    var gpa = (student1 + student2 + student3 + student4).toFloat() / totalStudent

    print(gpa)
}