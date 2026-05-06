package oop_00000107586_Theofilius.week11

fun main () {
    println("=== TEST EXTENNSION FUNCTION ===")
    println("Alex".addGreeting())
    println("Hi".repeat(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n==- TEST RUN FUNCTION ===")
    val result = "Kotlin".run {
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")

}