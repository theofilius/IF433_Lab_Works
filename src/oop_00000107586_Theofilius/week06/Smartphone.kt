package oop_00000107586_Theofilius.week06
//commit ulang karena salah tulis commit message
class Smartphone : Camera, Phone {
    override fun turnOn() {
        super<Camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem operasi Smartphone berhasil booting.")
    }

}