package oop_00000107586_Theofilius.week09

fun main() {
    // Explicit lambda parameter
    val squareExplicit: (Int) -> Int = { number: Int -> number * number }
    println("Square (explicit): ${squareExplicit(5)}")

    // Implicit parameter using `it`
    val squareImplicit: (Int) -> Int = { it * it }
    println("Square (implicit): ${squareImplicit(6)}")
}

