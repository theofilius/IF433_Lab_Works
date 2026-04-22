package oop_00000107586_Theofilius.week08

fun main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?.name ?: "Kota tidak diketahui"
    println("Tujuan pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price ->
        val tax = price * 0.11
        "Transaksi Valid. Harga: Rp$price, Pajak: Rp$tax"
    } ?: "Transaksi Invalid: Harga belum di-set!"

    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String
        text?.let { println("Ditemukan teks: ${it.uppercase()}") }
    }
    println("\n=== TEST THE RED BUTTON (11) ===")
    val toxicData: String? = null
    try {
        val length = requireNotNull(toxicData) {
            "CRITICAL EXCEPTION: toxicData tidak boleh null!"
        }.length
        println("Panjang toxicData: $length")
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }

    println("\n=== TEST JAVA INTEROP ===")
    val javaResponse = LegacyJavaAPI.fetchServerStatus()

    val statusLength = javaResponse!!.length
    println("Status dari java: $javaResponse (Length: $statusLength)")
}
