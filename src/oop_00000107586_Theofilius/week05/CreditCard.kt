package oop_00000107586_Theofilius.week05

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("Pembayaran kartu kredit berhasil sebesar Rp$amount. Terpakai: Rp$usedAmount dari limit Rp$limit")
        } else {
            println("Transaksi ditolak")
        }
    }
}
