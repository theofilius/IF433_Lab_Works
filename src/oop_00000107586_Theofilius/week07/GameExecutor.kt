package oop_00000107586_Theofilius.week07

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            val (monsterName) = event
            println("Monster muncul: $monsterName! Bersiap bertarung.")
        }

        is BattleState.LootDropped -> {
            val item = event.item
            println("Loot didapat: ${item.name} [${item.rarity}] (Damage: ${item.damage})")
        }

        is BattleState.GameOver -> {
            val (reason) = event
            println("GAME OVER: $reason")
        }

        BattleState.SafeZone -> {
            println("Area aman. Kamu bisa istirahat dan menyimpan progress.")
        }
    }
}

