package oop_00000107586_Theofilius.week09

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    val evenNumbers = numbers.filter { it % 2 == 0 }
    println("Even numbers: $evenNumbers")

    val sortedDescending = evenNumbers.sortedByDescending { it }
    println("Sorted descending: $sortedDescending")

    sortedDescending.forEach { number ->
        println("Number: $number")
    }
}
