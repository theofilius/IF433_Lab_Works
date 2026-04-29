package oop_00000107586_Theofilius.week10

class Box<T>(private var value: T) {
    fun getValue(): T = value

    fun setValue(newValue: T) {
        value = newValue
    }
}

