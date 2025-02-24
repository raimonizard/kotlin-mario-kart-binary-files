package models

import java.io.Serializable

class ItemMarioKart : Serializable {
    private var name: String        // Nom de l'objecte (per exemple, "Bolet", "Estrella")
    private var type: ItemType      // Tipus de l'objecte (ajuda, atac, defensa, etc.)
    private var duration: Int = 0   // Durada de l'efecte en segons (0 si no aplica)
    private var power: Int = 0       // Potència o efecte de l'objecte (com més alt, més potent)

    constructor(name: String, type: ItemType, duration: Int, power: Int) {
        this.name = name
        this.type = type
        this.duration = duration
        this.power = power
    }

    // Mètode per aplicar l'efecte de l'objecte
    fun applyEffect(): String {
        return when (this.type) {
            ItemType.BOOST -> "${this.name} guanya un impuls de velocitat durant $duration segons!"
            ItemType.ATTACK -> "${this.name} utilitza $name per atacar un oponent amb una potència de $power!"
            ItemType.DEFENSE -> "${this.name} utilitza $name per defensar-se d'un atac!"
            ItemType.SPECIAL -> "${this.name} utilitza $name i obté un avantatge especial durant $duration segons!"
        }
    }

    override fun toString(): String {
        return "ItemMarioKart(name='$name', type=$type, duration=$duration, power=$power)"
    }
}
