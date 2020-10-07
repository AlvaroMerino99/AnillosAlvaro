package personajes

import armas.Anillo

/**
 * objeto hobbit
 * en esta clase se hace el objeto Hobbit, que tiene como parámetro el nombre (heredado de personaje), y el arma anillo
 */
class Hobbit(nombre:String, var anillo: Anillo) : Personaje(nombre, Estado.vivo){
    /**
     * Método toString
     */
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Hobbit de la Comarca. \n"
    }

    /**
     * Frodo se pone el anillo
     */
    fun ponerseAnillo() {
        anillo.puesto=true
    }

    /**
     * frodo no se pone el anillo
     */
    fun quitarseAnillo(){
        anillo.puesto=false
    }
}

