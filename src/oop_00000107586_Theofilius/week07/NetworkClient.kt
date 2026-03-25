package oop_00000107586_Theofilius.week07

class NetworkClient private constructor(val url: String) {
    companion object {
        const val BASE_URL = "https://api.umn.ac.id"

        fun createClient(url: String = BASE_URL): NetworkClient {
            println("Membangun NetworkClient dengan url: $url")
            return NetworkClient(url)
        }


        fun createClien(): NetworkClient {
            return createClient()
        }
    }
    fun connect() {
        println("Connecting to $url...")
    }
}
