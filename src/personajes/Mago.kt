package personajes

import armas.Vara

/**
 * Clase Mago
 *  en esta clase se hace el objeto Mago, que tiene como parámetro el nombre (heredado de personaje), y el arma vara
 */
class Mago(nombre:String,var vara: Vara) : Personaje(nombre, Estado.vivo) {
//el objeto mago no tiene como atributo energía, ya que la energía depende de la vara
    /**
     * Recarga la vara con la energía que le pasemos
     * (esa energía será consumida del total de la vara)
     */
    fun recargarVara(energia:Int) {
        vara.poder=energia
    }

    /**
     * Devuelve el poder de la vara
     */
    fun poderVara():Int{
        return(vara.poder)
    }

    /**
     * Método to string
     */
    override fun toString(): String {
        return super.toString()+"Este Personaje es un Mago, y el poder de su vara es ${vara.poder}\n"
    }
}