package oop_00000107586_Theofilius.week10

class PairBox<K, V>(
    private val key: K,
    private val value: V
) {
    fun getKey(): K = key

    fun getValue(): V = value
}

