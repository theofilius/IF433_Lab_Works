package oop_00000107586_Theofilius.week01

fun main() {
    val gameTitle = "Fc 26"
    val price = 750000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500000)
        (price *20) / 100
else
        (price *10) / 100

fun printReceipt(title: String, finalPrice: Int, note: String?) {
    println("====Game Store Reciept====")
    println("Game: $title")
    println("Final Price: Rp $finalPrice")
    println("Note: ${note ?: "Tidak ada catatan"}")
}