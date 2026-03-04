package oop_00000107586_Theofilius.week05

abstract class PaymentMethod(val accountName: String) {
    abstract fun processPayment(amount: Double)
}
