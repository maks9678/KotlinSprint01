package org.example.lesson_19

fun main() {
    val tank1 = Tank()
    tank1.armament(1)
    tank1.armament(2)
    tank1.armament(3)

    tank1.shot(1)
    tank1.shot(2)
    tank1.shot(3)
}

enum class Cartridges(val id: Int, val damage: Int) {
    BLUE(1, 5),
    GREEN(2, 10),
    RED(3, 20);

    fun dealDamage() {
        println("нанесено $damage урона")
    }
}

class Tank() {
    val ammunition = mutableListOf<Cartridges>()
    fun armament(_id: Int) {
        val cartridge = when (_id) {
            Cartridges.BLUE.id -> Cartridges.BLUE
            Cartridges.GREEN.id -> Cartridges.GREEN
            Cartridges.RED.id -> Cartridges.RED
            else -> null
        }
        if (cartridge != null) {
            ammunition.add(cartridge)
            println("пополнен ${cartridge.name} боеприпас")
        } else println("неверный тип боеприпасов")
    }

    fun shot(_id: Int) {
        val cartridge = when (_id) {
            Cartridges.BLUE.id -> Cartridges.BLUE
            Cartridges.GREEN.id -> Cartridges.GREEN
            Cartridges.RED.id -> Cartridges.RED
            else -> null
        }
        if (cartridge?.id != null ) {
            ammunition.remove(cartridge)
            cartridge.dealDamage()
            println("выстрел $cartridge патроном")
        } else println("нет таких патронов")
    }
}