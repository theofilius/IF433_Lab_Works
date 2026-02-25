package oop_00000107586_Theofilius.week04

fun main() {
    println("--- Testing Employee Hierarchy ---")

    val manager = Manager(name = "James", baseSalary = 13_000_000)
    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    val developer = Developer(
        name = "Anton",
        baseSalary = 8_300_000,
        programmingLanguage = "Kotlin"
    )
    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
