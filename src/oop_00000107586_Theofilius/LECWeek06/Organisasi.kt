package oop_00000107586_Theofilius.LECWeek06

interface Organisasi {
    val namaOrg: String
    val budgetRapat: Int
    val jmlOrg: Int

    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat()
}