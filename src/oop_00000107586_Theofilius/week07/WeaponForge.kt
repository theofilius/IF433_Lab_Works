package oop_00000107586_Theofilius.week07

class Weapon private constructor(
    val item: GameItem,
    val durability: Int,
) {
    companion object {
        fun forgeStarterSword(): Weapon {
            val item = GameItem(
                name = "Pedang Kayu Bapuk",
                damage = 5,
                rarity = ItemRarity.COMMON,
            )
            return Weapon(item = item, durability = 50)
        }

        fun forgeEpicSword(): Weapon {
            val item = GameItem(
                name = "Pedang Naga Kuno",
                damage = 75,
                rarity = ItemRarity.EPIC,
            )
            return Weapon(item = item, durability = 200)
        }
    }
}

