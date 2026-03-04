package oop_00000107586_Theofilius.week05

fun main() {
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()

        when (pegawai) {
            is Dosen -> {
                println("=> Terdeteksi sebagai Dosen (NIDN: ${pegawai.nidn})")
                pegawai.mengajar()
            }
            is Admin -> {
                println("=> Terdeteksi sebagai Admin")
                pegawai.doAdminWork()
            }
        }

        println("----------------------")
    }

    val mathHelper = MathHelper()
    val luasPersegi = mathHelper.hitungLuas(4)
    val luasPersegiPanjang = mathHelper.hitungLuas(6, 3)
    val luasLingkaran = mathHelper.hitungLuas(7.0)

    println("=== OVERLOADING MATHHELPER ===")
    println("hitungLuas(4) = $luasPersegi")
    println("hitungLuas(6, 3) = $luasPersegiPanjang")
    println("hitungLuas(7.0) = $luasLingkaran")

    val eWallet = EWallet(accountName = "Theo Wallet", balance = 50000.0)
    val creditCard = CreditCard(accountName = "Theo Card", limit = 100000.0)
    val paymentMethods: List<PaymentMethod> = listOf(eWallet, creditCard)

    println("=== SIMULASI PEMBAYARAN ===")
    for (method in paymentMethods) {
        print("${method.accountName}: ")
        method.processPayment(75000.0)
    }
}
