package oop_00000107586_Theofilius.week06

class SmartHomeHub {
    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {
            if (device is Switchable) {
                device.turnOff()
            }
        }
    }

    fun activateSecurityMode() {
        for (device in devices) {
            if (device is Recordable) {
                device.startRecord()
            }
            if (device is SmartSpeaker) {
                println("Smart speaker \"${device.name}\" mengaktifkan sirine.")
                device.playMusic("Sirine Peringatan")
            }
        }
    }
}
