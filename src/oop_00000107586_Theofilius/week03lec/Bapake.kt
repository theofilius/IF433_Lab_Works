package oop_00000107586_Theofilius.week03lec

open class Bapake {
    private var nama: String = "Belum tau"
    private var umur: Int = 35
    protected var gaji: Int = 1000

    public var uangjajan: Int = 0
        set(value) {
            if (value < 0) {
                println(" Masa uang jajan 0 atau minus")
            } else {
                field = value
            }
        }
        get() {
            return field + 123
        }

    fun set_nama(namaBaru: String) {
        if (namaBaru.isBlank()) {
            println("Eh nama ga boleh kosong")
            return
        }
        nama = namaBaru
    }

    fun get_nama(): String {
        return this.nama
    }

    fun set_umur(umurBaru: Int) {
        if (umurBaru < 0) {
            println("Eh umur ga boleh minus")
            return
        }
        umur = umurBaru
    }

    fun get_umur(): Int {
        return this.umur
    }
}


fun main() {
    var ank = Anake()
    ank.set_nama("Udin")
    val bpk = Bapake()
    bpk.set_nama("Yanto")
    bpk.set_umur(40)
    println("Nama papi kamu ${bpk.get_nama()} Umurnya ${bpk.get_umur()}")
    print("Gaji bapak : " + ank.dapatin_gaji_bapak())

    ank.uangjajan = -100
}

class Anake: Bapake() {
    fun dapatin_gaji_bapak():Int {
        return this.gaji + 100
    }

}
