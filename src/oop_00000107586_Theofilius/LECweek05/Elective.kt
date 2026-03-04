package oop_00000107586_Theofilius.LECweek05

class Elective: MataKuliah () {
    override fun set_matkul(sks: Int) {
        super.nama = "VR Programming"
        println("Elektif ${super.nama} sks $sks")
    }
    fun ada_praktek() {
        println("wajib di praktekin")
    }
}
