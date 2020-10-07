package Personajes

import Armas.Anillo

class Hobbit(nombre:String, var anillo: Anillo) : Personaje(nombre, Estado.vivo){
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Hobbit, y el valor de AnilloPuesto es: "
    }
    fun ponerseAnillo(){
        anillo.puesto=true
    }
    fun quitarseAnillo(){
        anillo.puesto=false
    }
}

