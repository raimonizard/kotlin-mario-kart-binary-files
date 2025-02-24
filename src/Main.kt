import controllers.*
import models.*

fun main(){
    var llistaPersonatges: MutableList<CharacterMarioKart> = mutableListOf()
    llistaPersonatges = crearPersonatges()

    mostrarPersonatges(llistaPersonatges)

    // TODO: Importar i exportar MutableList de perconatges a fitxer binari
    // TODO: Completar CRUD personatges
}