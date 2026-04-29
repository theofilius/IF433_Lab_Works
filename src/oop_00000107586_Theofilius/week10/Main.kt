package oop_00000107586_Theofilius.week10

fun main() {
    val intBox = Box(123)
    println("Int box value: ${intBox.getValue()}")

    val stringBox = Box("Hello, Generic!")
    println("String box value: ${stringBox.getValue()}")

    val pairBox = PairBox("UMN", 2026)
    println("PairBox key: ${pairBox.getKey()}, value: ${pairBox.getValue()}")
}
