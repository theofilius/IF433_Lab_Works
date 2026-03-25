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
        is ApiResponse.Error -> "Munculkan alert: ${response.message}"
        ApiResponse.Loading -> "Tampilkan Spinner"
    }

    println(uiMessage)
}
