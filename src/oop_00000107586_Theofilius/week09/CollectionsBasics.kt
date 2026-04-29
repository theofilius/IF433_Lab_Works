package oop_00000107586_Theofilius.week09

fun main() {
    // Immutable List (read-only)
    val immutableList = listOf("BTC", "ETH", "SOL", "BTC")
    println("Immutable list: $immutableList")

    // Set (discard duplicates)
    val uniqueFromList = immutableList.toSet()
    println("Unique elements (set): $uniqueFromList")

    // Mutable List (can be modified)
    val mutableList = mutableListOf("AAPL", "TSLA", "NVDA")
    println("Mutable list (before): $mutableList")

    mutableList.add("MSFT")
    mutableList.remove("TSLA")
    println("Mutable list (after): $mutableList")
}
