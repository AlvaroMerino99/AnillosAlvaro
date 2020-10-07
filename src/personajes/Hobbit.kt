package personajes

import armas.Anillo

class Hobbit(nombre:String, var anillo: Anillo) : Personaje(nombre, Estado.vivo){
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Hobbit de la Comarca. \n"
    }
    fun ponerseAnillo() {
        anillo.puesto=true
    }
    fun quitarseAnillo(){
        anillo.puesto=false
    }
}

