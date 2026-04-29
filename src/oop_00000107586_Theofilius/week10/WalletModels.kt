package oop_00000107586_Theofilius.week10

data class Coin(
    override val name: String,
    val balance: Double
) : NamedEntity

data class Transaction(
    val id: String,
    val amount: Double
)
