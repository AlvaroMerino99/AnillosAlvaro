package Personajes

import Armas.Carcaj

class Elfo(nombre:String,var carcaj: Carcaj) : Personaje(nombre, Estado.vivo){
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Elfo, y en el carcaj tiene ${carcaj.flechas} flechas.\n"
    }
    fun lanzaFlechas(){
        carcaj.flechas--
        println("${this.nombre} ha disparado una flecha, le quedan ${carcaj.flechas} flechas en el carcaj\n")
    }
    fun recogeFlecas(flechas:Int){
        carcaj.flechas=flechas
        println("A ${this.nombre} le quedan ${carcaj.flechas} flechas en el carcaj\n")
    }
}
