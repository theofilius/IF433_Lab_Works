package oop_00000107586_Theofilius.LECWeek09

fun main () {
    println("========= LIST OF ==========")
    val arSiswa = listOf("Budi", "Susi", "Cica");
    //view
    println(arSiswa)
    //panjang array
    println("Banyak siswa" + arSiswa.size)
    //munculin 1 orang
    println("Siswa bernama ${arSiswa[1]}")

    for(a in arSiswa) {
        print(" Siswa " + a + " dan ")
    }


    println("========= LIST OF MUTEABLE ==========")
    val arMatkul = mutableListOf("OOP","Pemweb","Matdis","Kalkulus")
    arMatkul.add("Algo")
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove(element = "Pemweb")
    println(arMatkul)

    println("========= SET OF IMUT ==========")
    val arNilai = setOf(90,75,90,97,59,40,34,43)
    println("banyak nilai: ${arNilai.size}")
    println("ada angka 90 ga ${arNilai.contains(90)}")
    println(arNilai)

    println("========= SET OF MUTABLE ==========")
    val arMahasiswa = mutableSetOf("Andi", "Yuli", "Yanto", "Udin", "Yuda")
    arMahasiswa.add("Warno")
    arMahasiswa.remove("Yanto")
    println(arMahasiswa)

    println("========= MAP IMUT ==========")
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "sayur asem" to 2000
    )
    println(arResto)
    println("banyak menu ${arResto.size}")
    println("Harga ayam ${arResto["Ayam"]}")
    println("List Makanan: ${arResto.keys}")
    println("List harga: ${arResto.values}")
    println(arResto)


    println("========= MAP MUTABLE ==========")
    val arKHS = mutableMapOf(
        "Toni" to 90,
        "Nika" to 85,
        "Ara" to 87
    )
    arKHS.remove(key = "Toni")
    arKHS["Nika"]=92
    arKHS["Tono"]=99
    println(arKHS)

    println("========= LAMBDA ==========")
    fun tambah(a:Int, b:Int):Int {
        return a + b
    }
    println("Hasil penambahan ${(tambah( a=5,b=3))}")
    val kurang = { a:Int , b:Int -> a-b}
    println("Hasil pengurangan ${(kurang(5,3))}")

    println("========= LAMBDA { IT } ==========")
    val pangkat = {a:Int -> a*a}
    val hasilPangkat:(Int)-> Int = {it * it}
    println("Hasil pangkat ${hasilPangkat(5)}")

    println("========= FOREACH BIASA  ==========")
    for(a in arMatkul) {
        println(a)
    }

    println("========= FOREACH IT ==========")
    arMatkul.forEach{
        println(it)
    }

    println("========= FOREACH VARIABLE ==========")
    arMatkul.forEach {
        mk -> println(mk)
    }



}
