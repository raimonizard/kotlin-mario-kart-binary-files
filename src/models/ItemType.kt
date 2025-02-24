package models

import java.io.Serializable

enum class ItemType : Serializable {
    BOOST,      // Per exemple, bolets per accelerar
    ATTACK,     // Objectes per atacar (plàtan, petxina, etc.)
    DEFENSE,    // Objectes de defensa (caixa falsa, etc.)
    SPECIAL     // Objectes especials (estrella, bala, etc.)
}