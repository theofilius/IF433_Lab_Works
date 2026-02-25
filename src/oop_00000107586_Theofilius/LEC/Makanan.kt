package oop_00000107586_Theofilius.LEC

open class Makanan {
    private var namaResto: String = "";
    protected var harga:Int = 0;
    protected var stock:Int = 0;

    init {
        namaResto = "Steak 12";
        println("Resto saya $namaResto");

    }

   open public fun jual_makanan() {
        println("saya jual makanan");
    }
}