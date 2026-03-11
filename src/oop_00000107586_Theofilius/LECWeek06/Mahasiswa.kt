package oop_00000107586_Theofilius.LECWeek06

class Mahasiswa(
    override val namaOrg: String,
    override val budgetRapat: Int,
    override val jmlOrg: Int,
    override val namaMK: String,
    override val nilaiMK: Int
) : Organisasi, KelasMK {

    override fun rapat() {
        println("Sedang rapat di $namaOrg")
        println("Biaya konsumsi rapat: $biayaKonsumsi")
    }

    override fun penilaian() {
        println("Nilai $namaMK adalah $nilaiMK")
    }
}