package oop_00000107586_Theofilius.week11

fun String.addGreeting():String {
    return "Hello, $this"
}

fun String.repeatTimes(n: Int): String {
    return this.repeat(n)
}