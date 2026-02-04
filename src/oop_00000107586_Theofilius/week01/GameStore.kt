package oop_00000107586_Theofilius.week01

fun main() {
    val gameTitle = "Fc 26"
    val price = 750000

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReciept(title = gameTitle, finalPrice = finalPrice)
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        (price * 20) / 100
else
        (price *10) / 100

fun printReciept(title: String, finalPrice: Int) {
    println("====Game Store Reciept====")
    println("Game: $title")
    println("Final Price: Rp $finalPrice")
}