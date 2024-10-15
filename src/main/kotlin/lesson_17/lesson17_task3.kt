package org.example.lesson_17

fun main() {
    val foldr1 = Folder("курсовая", 2, true)
    foldr1.name
}

class Folder(
    val _name: String,
    val numberFile: Int,
    var isSecret: Boolean,
) {
    val name: String
        get() = if (isSecret) {
            "Скрытая папка и количество файлов – 0"
        } else {
            "Название - $_name, количество файлов – $numberFile"
        }
}