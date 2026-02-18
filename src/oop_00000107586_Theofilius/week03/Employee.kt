package oop_00000107586_Theofilius.week03

class Employee(val name: String) {
    var salary: Int = 0
    set(value) {
        if (value < 0) {
            println("ERROR: Gaji tidak boleh negatif! Di-set ke 0")
            field = 0
        } else {
            field = value
        }
    }
    private var performance: Int = 3

    val tax: Double
        get() = salary * 0.1

    fun increasePerformance() {
        performance++
        println("Kinerja $name meningkat! Rating: $performance")
    }

    fun printStatus() {
        println("Karyawan: $name, Rating: $performance")
    }
}
