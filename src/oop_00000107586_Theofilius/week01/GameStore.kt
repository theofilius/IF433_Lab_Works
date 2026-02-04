package oop_00000107586_Theofilius.week01

fun main() {
    val gameTitle = "Fc 26"
    val price = 750000
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        (price * 20) / 100
else
        (price *10) / 100