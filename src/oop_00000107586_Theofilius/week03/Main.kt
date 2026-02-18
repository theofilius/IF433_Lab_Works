package oop_00000107586_Theofilius.week03

fun main() {
    val e = Employee("Budi")

    e.salary = -1000
    e.salary = 5_000_000
    println("Gaji: ${e.salary}")

    e.increasePerformance()

    println("Pajak yang harus dibayar: ${e.tax}")
}
