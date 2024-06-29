package org.example.lesson_3

fun main() {

    var whereFrom = "E2"
    var where = "E4"
    var strokeNumber = 1

    var descriptionMove = "$whereFrom-$where;$strokeNumber"

    println(descriptionMove)

    whereFrom = "D2"
    where = "D3"
    strokeNumber = 2

    descriptionMove = "$whereFrom-$where;$strokeNumber"

    println(descriptionMove)

}