package oop_00000107586_Theofilius.week06

fun processCheckout(method: PaymentMethod, amount: Double) {
    println("-> Memulai checkout...")
    method.pay(amount)
}

fun main() {
    val myWatch = Smartwatch()
    myWatch.showTime()

    val myPhone = Smartphone()
    myPhone.turnOn()

    val pay1 = Gopay()
    val pay2 = CreditCard()

    println("\n === TESTING CHECKOUT ===")
    processCheckout(pay1, amount = 50000.0)
    processCheckout(pay2, amount = 150000.0)

    println("\n === TESTING SMART HOME DEVICES ===")
    val lamp = SmartLamp(id = "LAMP-001", name = "Ruang Tamu")
    val speaker = SmartSpeaker(id = "SPK-001", name = "Google Nest Dapur")
    val cctv = SmartCCTV(id = "CCTV-001", name = "Ezviz Garasi")

    lamp.turnOn()
    speaker.turnOn()
    speaker.playMusic("Lofi Beats")
    cctv.turnOn()

    val hub = SmartHomeHub()
    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("\n--- Security Mode ---")
    hub.activateSecurityMode()

    println("\n--- Turn Off All Switches ---")
    hub.turnOffAllSwitches()
}
