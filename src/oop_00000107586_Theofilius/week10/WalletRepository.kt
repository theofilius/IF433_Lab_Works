package oop_00000107586_Theofilius.week10

interface NamedEntity {
    val name: String
}

class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> = items.toList()
}

fun <T : NamedEntity> WalletRepository<T>.searchByName(query: String): List<T> {
    val q = query.trim()
    if (q.isEmpty()) return emptyList()

    return getAll().filter { it.name.contains(q, ignoreCase = true) }
}
