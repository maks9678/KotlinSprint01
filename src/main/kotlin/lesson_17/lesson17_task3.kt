package org.example.lesson_17

fun main() {
    val foldr1 = Folder("курсовая", 2, true)
    foldr1.name
}

class Folder(
    _name: String,
    val numberFile: Int,
    private var isSecret: Boolean,
) {
    val name: String = _name
        get() = if (isSecret) {
            "Скрытая папка и количество файлов – 0"
        } else {
            "Название - $field, количество файлов – $numberFile"
        }
}