package org.example.lesson_20

fun main (){
    val userName1 = "Иван"
    val splashScreen:(String)->Unit ={username-> println("С наступающим Новым Годом, $username!")}
    splashScreen(userName1)
}
