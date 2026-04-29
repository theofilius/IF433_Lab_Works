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

    fun <R> searchByName(query: String): List<R> where R : NamedEntity, R : Any {
        val q = query.trim()
        if (q.isEmpty()) return emptyList()

        @Suppress("UNCHECKED_CAST")
        return items
            .asSequence()
            .filterIsInstance<R>()
            .filter { it.name.contains(q, ignoreCase = true) }
            .toList()
    }
}
