package lec_week02

class Pemain {
    var nama: String = "tidak terdaftar";
    var speed: Int = 9;
    val shoot: Int = 8;

    init {
        this.nama = "Messi";
        println("ini adalah constructor");
    }
    constructor(alias: String="Budi", kecepatan:Int=2) {
        nama = alias;
        speed = kecepatan;
        println("Ini constructor kedua");
    }
    fun bawa_bola() {
        println("si $nama sedang bawa bola")
    }

}
    fun main() {
        val player= Pemain(alias="Jo", kecepatan =99);
        player.bawa_bola();
        println("nama pemain: ${player.nama}");
        println("Skill Kecepatan:" + player.speed);

        val player2 = Pemain(alias="Ronaldo", kecepatan =99);
        println("nama pemain: ${player.nama}");
        println("Skill Kecepatan:" + player.speed);
    }
