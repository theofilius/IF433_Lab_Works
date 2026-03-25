package oop_00000107586_Theofilius.LECweek07

fun main() {
    println("server: ${Koneksi.linkServer}")
    Koneksi.test_koneksi()

    Mahasiswa.nama="udin";
    val na:Int = Mahasiswa.set_nilai(80,100);
    println("Nilai ${Mahasiswa.nama} adalah $na")

    Mahasiswa.isi_nama_kampus("UMN")

    val dsn1= Dosen( nama = "Indah", nik = "12345", tahunMasuk = 2020);
    println(dsn1);
    val dsn2 = dsn1.copy(nama="Budi", nik="2345");
    println(dsn2);
    //cara ambil data satu field aja
    println("Nama dosen1: ${dsn1.nama} masuk tahun ${dsn1.tahunMasuk}");
    // Call ENUM Class
    println("Matkul fav saya: " + MataKuliah.OOP.name);
    println("Index matlul: " + MataKuliah.OOP.ordinal)
    MataKuliah.OOP.sks_matkul()

    //looping munculin semua
    for(matkul in MataKuliah.entries) {
        print("matkul: "+matkul);
        matkul.sks_matkul()
    }
}
