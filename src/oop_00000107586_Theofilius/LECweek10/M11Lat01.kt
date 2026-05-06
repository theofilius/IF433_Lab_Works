package oop_00000107586_Theofilius.LECweek10

fun panggil_nama(nama: String): String {
    return "Hai $nama"
}

fun String.panggil_mahasiswa(): String {
    val hasil = this.split(" ").joinToString(" ") { word ->
            word.replaceFirstChar { c -> c.uppercase()
            }
        }
    return "Hello $hasil"
}

// function extension - parameter
fun Int.tentukanLulus(nama:String): String {
    var keputusan = ""
    if(this >= 70){
        keputusan = "Lulus"
    } else {
        keputusan = "Remedial"
    }
    return "Mahasiswa $nama hasil keputusan adalah $keputusan"
}

// function extension - cek null
fun String?.cekNulldanEmpty():String{
    if(this == null || this.isEmpty()) {
        return "ga boleh null atau kosong"
    } else {
        return "username kamu adalah $this"
    }
}

class Mahasiswa() {
    var nim:String =""
    var nama:String = ""
    var ipk:Int = 0
}

fun main() {
    // cara panggil extension - null
    var inputUsername: String? = "JO"
    println(inputUsername.cekNulldanEmpty())

    // cara panggil function extension - parameter
    println(80.tentukanLulus(nama = "Revan"))

    println(panggil_nama("Toni").uppercase())
    println("tonyyyy stark".panggil_mahasiswa())

    // SCOPE - LET
    var kampusSaya = "UMN"
    kampusSaya.let {
        if (it == "UMN"){
            println("kampus " + it + "Keren")
    } else {
        println("Keren")
    }
}

    // SCOPE - RUN
    var alamatSaya = "Gading Serpong"
    alamatSaya.run {
        println("Saya tinggal di " + this)
    }

    //SCOPE - WITH
    var gradeSaya = with(receiver = 90 ){
        if(this >= 80) {
            "A"
        }
        else if (this >= 70){
            "B"
        }
        else {
            "C"
        }
    }
    println("Grade kamu adalah $gradeSaya")

    // SCOPE - APPLY
    var dataMahasiswa = Mahasiswa().apply {
        nama = "Yudi"
        nim ="12345"
        ipk = 3
    }
    println("Mahasiswa ${dataMahasiswa.nama} dgn nim ${dataMahasiswa.nim} ipknya ${dataMahasiswa.ipk}")

    // SCOPE - ALSO
    var deretAngka = mutableListOf<Int>(80,70,75,68,85)
    deretAngka.also {
        println("Sebelum $deretAngka")
    }.add(90)
    println("Setelah $deretAngka")
}
