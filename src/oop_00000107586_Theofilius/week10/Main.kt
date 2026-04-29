package oop_00000107586_Theofilius.week10

fun main() {
    val intBox = Box(123)
    println("Int box value: ${intBox.getValue()}")

    val stringBox = Box("Hello, Generic!")
    println("String box value: ${stringBox.getValue()}")

    val pairBox = PairBox("UMN", 2026)
    println("PairBox key: ${pairBox.getKey()}, value: ${pairBox.getValue()}")

    printData(3.14)
    val returnedString = returnData("Kotlin Generic")
    printData(returnedString)

    val numericStorage = NumericalStorage(10, 4)
    println("Add: ${numericStorage.add()}")
    println("Subtract: ${numericStorage.subtract()}")
    println("Multiply: ${numericStorage.multiply()}")
    println("Divide: ${numericStorage.divide()}")

    println("Max value (Int): ${maxValue(7, 12)}")
    println("Max value (Double): ${maxValue(2.5, 2.4)}")
}
