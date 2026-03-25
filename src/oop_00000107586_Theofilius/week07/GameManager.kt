package oop_00000107586_Theofilius.week07

object GameManager {
    var isGameRunning: Boolean = false

    fun startGame() {
        if (isGameRunning) {
            println("Game sudah berjalan! Mencegah instansiasi ganda.")
            return
        }

        isGameRunning = true
        println("Memulai Game Engine...")
    }
}

