package oop_00000107586_Theofilius.LECweek08

class set_krs(val nim: String?, val kodematkul: String?) {
    fun matkul_wajib(sks:Int?) {
        println("Matkul kamu $kodematkul sks-nya adalah $sks");
    }
}
fun main() {
    var nama: String? = "John"
    nama = null
    println("Hai $nama")

    val settingKRS = set_krs(nim = "123", kodematkul = "null")
    println("NIM kamu ${settingKRS.nim} matkul kamu ${settingKRS.kodematkul}")
    settingKRS.matkul_wajib(null)
}