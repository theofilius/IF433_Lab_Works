package oop_00000107586_Theofilius.LECweek07

class Mahasiswa private constructor(val kampus:String) {
    companion object {
        var nama: String = "Unknown"

        fun set_nilai(uts:Int, uas:Int):Int {
            return (uts+uas)/2;
        }

        fun isi_nama_kampus(namaUniv:String) {
            Mahasiswa(namaUniv);
        }
    }
    //bagian yang class biasa (Bukan companion object)
    init {
        println("nama kampus kamu $kampus");
    }
}
