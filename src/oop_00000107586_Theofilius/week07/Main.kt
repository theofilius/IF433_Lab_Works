package oop_00000107586_Theofilius.week07

fun main() {
    // Ini akan memunculkan compiler error karena konstruktor NetworkClient bersifat private.
    val client = NetworkClient("https://api.umn.ac.id")
    client.connect()
}
