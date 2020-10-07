package Personajes

import Armas.Vara

class Mago(nombre:String,var vara: Vara) : Personaje(nombre, Estado.vivo) {
//el objeto mago no tiene como atributo energía, ya que la energía depende de la vara
    /**
     * Recarga la vara con la energía que le pasemos
     * (esa energía será consumida del total de la vara)
     */
    fun recargarVara(energia:Int) {
        vara.poder=energia
    }
    fun poderVara():Int{
        return(vara.poder)
    }

    override fun toString(): String {
        return super.toString()+"Este Personaje es un Mago, y el poder de su vara es ${vara.poder}"
    }
}