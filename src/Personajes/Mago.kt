package Personajes

import Armas.Vara

class Mago(nombre:String,vara: Vara) : Personaje(nombre, Estado.vivo) {
//el objeto mago no tiene como atributo energía, ya que la energía depende de la vara
    /**
     * Recarga la vara con la energía que le pasemos
     * (esa energía será consumida del total de la vara)
     */
    fun recargarVara(energia:Int) {
        Vara.poder=energia
    }

    override fun toString(): String {
        return super.toString()+"Este Personaje es un Mago, y el poder de su vara es ${vara.poder}"
    }
}