package oop_00000107586_Theofilius.LECweek05

class Wajib: MataKuliah () {
    override fun set_matkul(sks: Int) {
        super.nama = "OOP";
        println("Matkul ${super.nama} sks $sks");
    }
    fun ada_smeminar() {
        println("Wajib ada seminar");
    }
}
