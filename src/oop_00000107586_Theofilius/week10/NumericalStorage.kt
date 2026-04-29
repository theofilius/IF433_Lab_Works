package oop_00000107586_Theofilius.week10

class NumericalStorage<T : Number>(private val a: T, private val b: T) {
    fun add(): Double = a.toDouble() + b.toDouble()

    fun subtract(): Double = a.toDouble() - b.toDouble()

    fun multiply(): Double = a.toDouble() * b.toDouble()

    fun divide(): Double = a.toDouble() / b.toDouble()
}

