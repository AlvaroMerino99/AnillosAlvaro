package personajes

import armas.Carcaj

/**
 * objeto Elfo
 *  en esta clase se hace el objeto Elfo, que tiene como parámetro el nombre (heredado de personaje), y el arma carcaj
 */
class Elfo(nombre:String,var carcaj: Carcaj) : Personaje(nombre, Estado.vivo){
    /**
     * Método toString
     */
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Elfo, y en el carcaj tiene ${carcaj.flechas} flechas.\n"
    }

    /**
     * Legolas lanza flechas
     */
    fun lanzaFlechas(){
        carcaj.flechas--

    }

    /**
     * Legolas recarga sus flechas
     */
    fun recogeFlecas(flechas:Int){
        carcaj.flechas=flechas

    }
}
