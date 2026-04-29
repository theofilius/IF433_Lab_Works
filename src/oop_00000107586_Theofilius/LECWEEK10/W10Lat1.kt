package oop_00000107586_Theofilius.LECWEEK10

// code non generic
class rumah(val alamat:Any)

//code generic
class kampus<T>(val akamat:T)

// multi param
class Komputer<T, V>(val merk:T, val barcode:V)

// Generic function
fun <T: Int> Password(isiPass:T): Int {
    return isiPass
}

// code generic - function ada constraint
class kalkulator<T: Number>(val a:T, val b:T) {
    fun tambah(): Int {
        return a.toInt() + b.toInt()
    }
    fun kurang(): Double {
        return a.toDouble() - b.toDouble();
    }
}
// Generic - WHERE
val daftarNilai = listOf(60,71,71,26,75,47,34)
fun<T> penilaian(List: List<T>, kkm:T):t<T> where T: Comparable<T> {
    return list.filter { it >=kkm }
}
fun main () {

    println("======= Generic - WHERE =======")
    println("Daftar nilai:" +daftarNilai)
    val nilaiAtasKKM = penilaian(list=daftarNilai, kkm=70)
    println("Nilai diatas KMM:" +nilaiAtasKKM)

    println("======= Generic - Constraint========")
    val kalk = kalkulator(10.52,20.47)
    println("penambahan: ${kalk.a} ditambah ${kalk.b} : " + kalk.tambah())
    println("pengurangan: ${kalk.a} ditambah ${kalk.b} : " + kalk.kurang())


    println("======= Generic Function ========")
    println("Password kamu: " + Password(isiPass = 123))


    println("======= GENERIC-MULTI PARAM========")
    val komp= Komputer(merk = "Dell", barcode = 12345)
    println("Merk Komputer :" + komp.merk)
    println("Barcode Komputer : ${komp.barcode}")

    println("======= SAMPLE NON-GENERIC ========")
    val rmh=rumah(alamat = 200)

}