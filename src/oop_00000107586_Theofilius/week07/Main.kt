package oop_00000107586_Theofilius.week07

fun main() {
    println("=== TEST SINGLETON ===")
    println("Status: ${DatabaseManager.connectionStatus}")
    DatabaseManager.connect()

    println("\n--- TEST COMPANION OBJECT ===")
    val client = NetworkClient.createClient()
    client.connect()

    println("\n=== TEST REGULAR CLASSES ===")
    val data1 = DataUser("Alice", 22)
    val data2 = DataUser("Alice", 22)
    val data3 = data1.copy(age = 23)
    println("Hasil Copy: $data3")

    val (userName, userAge) = data1
    println(data1)
    println("Sama? ${data1 == data2}")

    println("\n=== TEST SEALED CLASS ===")
    val response: ApiResponse = ApiResponse.Success("Data berhasil ditaril!")

    val uiMessage = when(response) {
        is ApiResponse.Success -> "Tampilkan: ${response.data}"
        is ApiResponse.Error -> "Munculkan alert" +
                ": ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)

    println("\n=== SIMULASI CORE RPG ===")
    GameManager.startGame()
    GameManager.startGame()

    println("\n=== SIMULASI FACTORY & ENUM ===")
    println("Drop chance LEGENDARY: ${ItemRarity.LEGENDARY.dropChance}%")

    val starterWeapon = Weapon.forgeStarterSword()
    println(
        "Starter Weapon: ${starterWeapon.item.name} " +
            "(Damage: ${starterWeapon.item.damage}, Rarity: ${starterWeapon.item.rarity}, Durability: ${starterWeapon.durability})"
    )

    println("\n=== SIMULASI BLACKSMITH (COPY) ===")
    val upgradedItem = starterWeapon.item.copy(damage = 25)
    println("Upgrade selesai: ${upgradedItem.name} (Damage: ${upgradedItem.damage}, Rarity: ${upgradedItem.rarity})")

    println("\n=== SIMULASI EVENT PERTARUNGAN ===")
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedItem))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
