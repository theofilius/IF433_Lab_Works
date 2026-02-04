package oop_00000107586_Theofilius.week01

fun main() {
    val radius = 7.0
    val pi = 3.14

    val area = pi * radius * radius

    println("Radius: $radius, Area: $area")

    checkSize(area)
}

fun checkSize(area: Double) =
    if (area > 100) "This is a Big Circle"
    else  "This is smaller than 100"
