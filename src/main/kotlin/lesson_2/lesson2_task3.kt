package org.example.lesson_2

fun main() {

    var departureTime: List<String> = "9:39".split(":")
    var travelTimeMinuts = 457

    val trevelTimeHorus = travelTimeMinuts / 60
    travelTimeMinuts = travelTimeMinuts % 60

    var arrivalTime = arrayOf(0,0)

    arrivalTime[0] = departureTime[0].toInt() + trevelTimeHorus
    arrivalTime[1] = departureTime[1].toInt() + travelTimeMinuts

    if(arrivalTime[1] > 60){
        arrivalTime[0]+=1
        arrivalTime[1]-=60
    }
    else if(arrivalTime[1]==60){
        arrivalTime[0]+=1
        arrivalTime[1]=0
    }

    print("${arrivalTime[0]}:${arrivalTime[1]}")
}


