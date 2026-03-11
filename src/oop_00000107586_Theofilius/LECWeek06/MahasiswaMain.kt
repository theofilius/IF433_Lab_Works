package oop_00000107586_Theofilius.LECWeek06

fun main() {
    val mhs = Mahasiswa(
        namaOrg = "HMIF",
        budgetRapat = 15000,
        jmlOrg = 20,
        namaMK = "OOP",
        nilaiMK = 89
    )

    mhs.rapat()
    mhs.penilaian()
}