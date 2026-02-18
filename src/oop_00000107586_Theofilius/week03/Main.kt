package oop_00000107586_Theofilius.week03

fun main() {
    val weapon = Weapon("Dragon Slayer")
    weapon.damage = -50
    weapon.damage = 9999
    println("Tier senjata: ${weapon.tier}")

    val player = Player("Theofilius")
    // player.xp = 100
    player.addXp(50)
    player.addXp(60)
}
