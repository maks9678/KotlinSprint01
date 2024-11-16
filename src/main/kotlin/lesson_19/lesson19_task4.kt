package org.example.lesson_19

fun main() {
    val tank1 = Tank()
    tank1.armament(Cartridges.BLUE)
    tank1.armament(Cartridges.GREEN)
    tank1.armament(Cartridges.RED)

    tank1.loadCartridge(Cartridges.BLUE)
    tank1.shot()
    tank1.loadCartridge(Cartridges.GREEN)
    tank1.shot()
    tank1.loadCartridge(Cartridges.RED)
    tank1.shot()
    tank1.shot()
}

enum class Cartridges(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20);

    fun dealDamage() {
        println("нанесено $damage урона")
    }
}

class Tank(
    var loadedCartridge: Cartridges? = null,
) {
    val ammunition = mutableListOf<Cartridges>()
    fun armament(missile: Cartridges) {
        ammunition.add(missile)
        println("пополнен ${missile.name} боеприпас")
    }

    fun loadCartridge(missile: Cartridges) {
        if (ammunition.contains(missile)) {
            loadedCartridge = missile
            println("Заряжен патрон: ${missile.name}")
        } else println("Нет таких патронов")
    }

    fun shot() {
        if (loadedCartridge != null) {
            println("выстрел $loadedCartridge патроном")
            loadedCartridge?.dealDamage()
            ammunition.remove(loadedCartridge)
            loadedCartridge = null
        } else println("не заряжено")
    }
}